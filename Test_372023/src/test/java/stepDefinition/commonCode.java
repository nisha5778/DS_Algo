package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class commonCode {
	static WebDriver driver =  baseClass.baseClassDriver;
	By lnkTryHere = By.xpath("//a[text()='Try here>>>']");
	By btnRun = By.xpath("//button[text()='Run']");
	By lnkPracticeQ = By.xpath("//a[text()='Practice Questions']");

	public static void EnterCode(boolean flag, String strFileName) throws IOException, InterruptedException {
		String sheetName="";
		String strCode = "";
		String strFilePath  = System.getProperty("user.dir") + 
					"/src/test/resources/testData//" + strFileName;
		File excelFile = new File(strFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		if(flag == true) { // enter valid code
			sheetName = "Code1";
		}
		else if(flag == false) {// enter invalid code
			sheetName = "Code2";			
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		Iterator<Row> row = sheet.rowIterator();
		
		while(row.hasNext()){
			Row currentRow = row.next();
			Iterator<Cell> cell = currentRow.cellIterator();
			while(cell.hasNext()) {
				Cell currentCell = cell.next();
				strCode = currentCell.getStringCellValue();
				driver.switchTo().activeElement().sendKeys(strCode + "\n");
				driver.switchTo().activeElement().sendKeys(Keys.ENTER , Keys.HOME);
			}
		}
		workbook.close();
	}
	
	@When("The user clicks on Tryhere link")
	public void the_user_clicks_on_tryhere_link() throws InterruptedException {
		//Thread.sleep(6000);
		driver.findElement(lnkTryHere).click();	  
	}	
	@Then ("The user should be directed to Editor page with Run button")
	public void the_user_should_be_directed_to_editor_page_with_run_button() {
		String strURL = "https://dsportalapp.herokuapp.com/tryEditor";
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals(strURL,driver.getCurrentUrl());
	}
	@And("Clicks run button after valid code")
	public void clicks_run_button_after_valid_code() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(btnRun).click();
	}
	@And("Clicks run button after invalid code")
	public void clicks_run_button_after_invalid_code() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(btnRun).click();
	}
	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.print("size : " + lst1.size());

		if (lst1.size() > 0 ){
			System.out.print("output : " + lst1.get(0).getText());
		}	
	}
	@When("The user clicks on Practice Questions link")		
	public void the_user_clicks_on_practice_questions() {
		driver.findElement(lnkPracticeQ).click();
	}
}
