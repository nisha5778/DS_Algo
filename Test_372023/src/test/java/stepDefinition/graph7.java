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
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class graph7 {
	WebDriver driver =  base.baseClassDriver;
	By btnGetStartedGraph = By.xpath("//h5[text()='Graph']/..//a");
	By btnGetStarted = By.xpath("//button[text()='Get Started']");
	By txtUserName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//input[@type='submit']");
	By lnkGraph = By.xpath("//ul/a[text()='Graph']");
	By lnkTryHere = By.xpath("//a[text()='Try here>>>']");
	By btnRun = By.xpath("//button[text()='Run']");
	By lnkGraphRepresentations = By.xpath("//ul/a[text()='Graph Representations']");
	By lnkPracticeQ = By.xpath("//a[text()='Practice Questions']");
	
	 @Given("The user is on graph home page")
	 public void the_user_is_on_graph_home_page() {
		 driver.get("https://dsportalapp.herokuapp.com/graph/");
	 }
	
	//**********************************************************************//
	//@tagGraph2
	@Given ("The user is on the Graph Page")
	public void the_user_is_on_the_graph_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
	}	
	@When("The user clicks Graph link on Graph page")
	public void the_user_clicks_the_graph_link_on_graph_page() throws InterruptedException {
		//Thread.sleep(6000);
		driver.findElement(lnkGraph).click();	  
	}	
	@Then ("The user should be redirected to Graph Graph page")
	public void the_user_should_be_redirected_to_graph_graph_page() {
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/graph/", driver.getCurrentUrl());
		//System.out.println("Title : " + driver.getCurrentUrl());
	}
	//**********************************************************************//
	//@tagGrapg3
	@Given ("The user navigates to Graph-Graph page")
	public void the_user_navigates_to_graph_graph_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
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
	//**********************************************************************//
	//@tagGraph4 & @tagGraph5
	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		System.out.println("Title : " + driver.getCurrentUrl());
	}
	 
	@When("The user enters valid python code in Editor")
	public void the_user_enters_valid_python_code_in_editor_from_sheet() throws IOException, InterruptedException{
		EnterCode(true);
	}
	@When("The user enters invalid python code in Editor")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet() throws IOException, InterruptedException{
		EnterCode(false);
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.println("size : " + lst1.size());
		if (lst1.size() > 0 ){
			System.out.println("output : " + lst1.get(lst1.size()-1).getText());
		}
	}	
	private void EnterCode(boolean flag) throws IOException, InterruptedException {
		String sheetName="";
		String strCode = "";
		String strFilePath  = System.getProperty("user.dir") + "/src/test/resources/testData//PythonCode.xlsx";
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
	//**********************************************************************//
	//@tagGraph6
	@When("The user clicks on Graph Representations link")
	public void the_user_clicks_on_graph_representations_link(){
		driver.findElement(lnkGraphRepresentations).click();
	}	
	@Then ("The user should be redirected to Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/graph-representations/", 
				driver.getCurrentUrl());
	}
	//**********************************************************************//
	//@tagGraph7
	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.print("size : " + lst1.size());

		if (lst1.size() > 0 ){
			System.out.print("output : " + lst1.get(0).getText());
		}	
	}
	//**********************************************************************//
	//@tagGraph8
		
	//**********************************************************************//
	//@tagGraph10
	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
	}
	@When("The user clicks on Practice Questions in graph representations page")		
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		driver.findElement(lnkPracticeQ).click();
	}
	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/practice", 
				driver.getCurrentUrl());
	}
	   

}
	

