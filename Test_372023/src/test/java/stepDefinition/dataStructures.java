package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class dataStructures {
	static WebDriver driver =  baseClass.baseClassDriver;	
	By lnkTimeComplexity = By.xpath("//a[text()='Time Complexity']");
	//background
	@Given("The user is on data structures home page")
	 public void the_user_is_on_data_structures_home_page() {
		//driver.get("");	
		driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}	
	@When("The user clicks time complexity link on data structures page")
	public void the_user_clicks_the_time_complexity_link_on_data_structures_page() throws InterruptedException {
		//Thread.sleep(6000);
		driver.findElement(lnkTimeComplexity).click();	  
	}

	   
	@Then("The user should be redirected to time complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		Assert.assertEquals("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/", 
				driver.getCurrentUrl());
		//System.out.println("Title : " + driver.getCurrentUrl());
	}
	   
	@When("The user enters valid python code in Editor from time complexity page")
	public void the_user_enters_valid_python_code_in_editor_from_time_complexity_page() throws IOException, InterruptedException{
		commonCode.EnterCode(true, "PythonCode_DS.xlsx");
	}
	
    @When("The user enters invalid python code in Editor from time complexity page")
	public void the_user_enters_invalid_python_code_in_editor_from_time_complexity_page() throws IOException, InterruptedException{
		commonCode.EnterCode(false, "PythonCode_DS.xlsx");
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.println("size : " + lst1.size());
		if (lst1.size() > 0 ){
			System.out.println("output : " + lst1.get(lst1.size()-1).getText());
		}
	}
    @Then("The user should be redirected to data strcuctures practice questions page")		
	public void the_user_should_be_redirected_to_data_structures_practice_questions_page() {
	System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/data-structures-introduction/practice", 
				driver.getCurrentUrl());
	}
}
