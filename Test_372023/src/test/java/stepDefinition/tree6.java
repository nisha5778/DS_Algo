package stepDefinition;

import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class tree6 {
	
	static WebDriver driver =  baseClass.baseClassDriver;
	By lnkOverviewOfTrees = By.xpath("//a[text()='Overview of Trees']");
	By lnkTerminologies = By.xpath("//a[text()='Terminologies']");
	By lnkTypesOfTrees = By.xpath("//a[text()='Types of Trees']");
	By lnkTreeTraversals = By.xpath("//a[text()='Tree Traversals']");
	By lnkTraversalsIllustrations = By.xpath("//a[text()='Traversals-Illustration']");
	By lnkBinaryTrees = By.xpath("//a[text()='Binary Trees']");
	By lnkTypesOfBinaryTrees = By.xpath("//a[text()='Types of Binary Trees']");
	By lnkImplementationInPython = By.xpath("//a[text()='Implementation in Python']");
	By lnkBinaryTreeTraversals = By.xpath("//a[text()='Binary Tree Traversals']");
	By lnkImplementationOfBinaryTrees = By.xpath("//a[text()='Implementation of Binary Trees']");
	By lnkApplicationsOfBinaryTrees = By.xpath("//a[text()='Applications of Binary trees']");
	By lnkBinarySearchTrees = By.xpath("//a[text()='Binary Search Trees']");
	By lnkImplementationOfBST = By.xpath("//a[text()='Implementation Of BST']");
	By lnkPracticeQuestions = By.xpath("//a[text()='Practice Questions']");
	By lnkDropdownTree = By.xpath("//div[@class='dropdown-menu show']/a[text()='Tree']");
	By lnkDropdownMainMenu = By.xpath("//a[text()='Data Structures']");
	
	@When("The user clicks the tree item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() throws InterruptedException {
		driver.findElement(lnkDropdownMainMenu).click();
		Thread.sleep(2000);
		driver.findElement(lnkDropdownTree).click();	  
	}
	@Then("The user should be redirected to tree page")
	public void the_user_should_be_redirected_to_tree_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/tree/",
				driver.getCurrentUrl());
	}
	//**********************************************************************//
	//background
	@Given("The user is on tree home page")
	 public void the_user_is_on_tree_home_page() {
		//driver.get("");	
		driver.get("https://dsportalapp.herokuapp.com/tree/");
	 }	
	
	
	@When("The user enters valid python code in Editor from tree page")
	public void the_user_enters_valid_python_code_in_editor_from_tree_page() throws IOException, InterruptedException{
		commonCode.EnterCode(true, "PythonCode_Tree.xlsx");
	}
	@When("The user enters invalid python code in Editor from tree page")
	public void the_user_enters_invalid_python_code_in_editor_from_tree_page() throws IOException, InterruptedException{
		commonCode.EnterCode(false, "PythonCode_Tree.xlsx");
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.println("size : " + lst1.size());
		if (lst1.size() > 0 ){
			System.out.println("output : " + lst1.get(lst1.size()-1).getText());
		}
	}
	
	//**********************************************************************//
	//@tagTree2-5
	 @When("The user clicks overview of trees link on tree page")
	 public void the_user_clicks_overview_of_trees_link_on_tree_page() {
		 driver.findElement(lnkOverviewOfTrees).click();
	 }
	 @Then("The user should be redirected to overview of trees page")
	 public void the_user_should_be_redirected_to_overview_of_trees_page() {
		 Assert.assertEquals("https://dsportalapp.herokuapp.com/tree/overview-of-trees/",
				 driver.getCurrentUrl()); 
	 } 
	//**********************************************************************//
	//@tagTree6-9	 
	 @When("The user clicks terminologies link on tree page")
	 public void the_user_clicks_terminologies_link_on_tree_page() {
		 driver.findElement(lnkTerminologies).click();
	 }	 
	 @Then("The user should be redirected to terminologies page")
	 public void the_user_should_be_redirected_to_teminologies_page() {
		 Assert.assertEquals("https://dsportalapp.herokuapp.com/tree/terminologies/",
				 driver.getCurrentUrl()); 	 
	 }  
	//**********************************************************************//
	//@tagTree6-10 
	 @When("The user clicks types of trees link on tree page")
	 public void the_user_clicks_types_of_trees_link_on_tree_page() {
		 driver.findElement(lnkTypesOfTrees).click();
	 } 
	 @Then("The user should be redirected to type of trees page")
	 public void the_user_should_be_redirected_to_type_of_trees_page () {
		 Assert.assertEquals("https://dsportalapp.herokuapp.com/tree/types-of-trees/",
				 driver.getCurrentUrl()); 
	 }
	 @When("The user clicks practice questions link")
	 public void the_user_clicks_practice_questions_link_on_tree_page() {
		 driver.findElement(lnkPracticeQuestions).click();
	 }
	 
	 @Then("The user should be redirected to tree practice questions page")
	 public void the_user_should_be_redirected_to_practice_questions_page() {
	 Assert.assertEquals("https://dsportalapp.herokuapp.com/tree/practice",
			 driver.getCurrentUrl()); 	 
	 } 
}
