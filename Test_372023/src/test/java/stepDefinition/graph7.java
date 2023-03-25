package stepDefinition;

/*
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import io.cucumber.java.en.And;
*/
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;


public class graph7 {
	static WebDriver driver =  baseClass.baseClassDriver;
	By btnGetStartedGraph = By.xpath("//h5[text()='Graph']/..//a");
	By btnGetStarted = By.xpath("//button[text()='Get Started']");
	By txtUserName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//input[@type='submit']");
	By lnkGraph = By.xpath("//ul/a[text()='Graph']");
	By lnkGraphRepresentations = By.xpath("//ul/a[text()='Graph Representations']");

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

	//**********************************************************************//
	//@tagGraph4 & @tagGraph5
	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		System.out.println("Title : " + driver.getCurrentUrl());
	}
	 
	@When("The user enters valid python code in Editor from graph page")
	public void the_user_enters_valid_python_code_in_editor_from_graph_page() throws IOException, InterruptedException{
		commonCode.EnterCode(true, "PythonCode_Graph.xlsx");
	}
	@When("The user enters invalid python code in Editor from graph page")
	public void the_user_enters_invalid_python_code_in_editor_from_graph_page() throws IOException, InterruptedException{
		commonCode.EnterCode(false, "PythonCode_Graph.xlsx");
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.println("size : " + lst1.size());
		if (lst1.size() > 0 ){
			System.out.println("output : " + lst1.get(lst1.size()-1).getText());
		}
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
	//@tagGraph10
	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
	}

	@Then("The user is directed to graph Practice questions page")
	public void the_user_is_directed_to_graph_practice_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/practice", 
				driver.getCurrentUrl());
	}
}
