package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class home {
	WebDriver driver =  base.baseClassDriver;
	String url = base.basicURL;
	By lnkDropdownGraph = By.xpath("//div[@class='dropdown-menu show']/a[text()='Graph']");
	By lnkDropdownMainMenu = By.xpath("//a[text()='Data Structures']");
	//driver.findElement(By.xpath("//button[text()='Get Started']")) WebElement btnGetStarted;
	//@FindBy (xpath = "//button[text()='Get Started']") WebElement btnGetStarted;
	By btnGetStarted = By.xpath("//button[text()='Get Started']");
	By txtUserName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//input[@type='submit']");
	By lnkSignin = By.xpath("//a[text()='Sign in']");
	By lstGetStartedBtns = By.xpath("//a[text()='Get Started']");
	By errorMsg = By.xpath("//div[contains(text() , 'You are not logged in')]");
	By lnkDropdown = By.xpath("//a[text()='Data Structures']");
	By lnkDropdownStack = By.xpath("//a[contains(text(),'Stack')]");
	By lnkRegister = By.xpath("//a[text()=' Register ']");
	
	//@Before
	
	public void LaunchBrowser() {
		//DesiredCapabilities capabilities;
		//capabilities = DesiredCapabilities.chrome();
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--ignore-certifcate-errors");
		//chromeOptions.addArguments("test-type");
		//capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver();
		
		//driver = new InternetExplorerDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//PageFactory.initElements(driver, this);
	}
	
	//@Before Suite
	
	public void CloseBrowser() {
		//driver.close();
	}
	/*@Given("User Lauches Chrome Browser")
	public void user_lauches_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\manas\\Nisha_Workspace\\NishaRepositary\\Project_DSAlgo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
	}*/
	
	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
		//base.initializeOption();		
	
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get(url);
		driver.manage().window().maximize();	
		PageFactory.initElements(driver, this);
	}

	/*@When("User clicks GetStarted button")
	public void user_clicks_get_started_button() {
	   //driver.findElement(btnGetStarted).click();
		btnGetStarted.click();
	}
	
	@Then("Open Home Page")
	public void open_home_page() {
	}*/

	
	@When("The login link is clicked")
	public void the_login_link_is_clicked() {
		driver.findElement(lnkSignin).click();	   
	}

	
	@When("user enters user name")
	public void user_enters_user_name() {
		 driver.findElement(txtUserName).sendKeys(base.userName);
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(txtPassword).sendKeys(base.password);

	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btnLogin).click();
	}
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		
		driver.get(url);
		PageFactory.initElements(driver, this);

	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_button() {
		driver.findElement(btnGetStarted).click();
		//btnGetStarted.click();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	  // Assert.assertEquals("https://dsportalapp.herokuapp.com/home", driver.getTitle());
	  // Assert.isTrue(false, url, null)
		System.out.println("Title : " + driver.getCurrentUrl());
	}

	@When("The user clicks on Get Started link on homepage without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login() {
		driver.findElements(lstGetStartedBtns).get(1).click();
	}
	@Then("The user gets warning message \\\"([^\\\"]*)\\\"$")
	public void the_user_gets_warning_message_You_are_not_logged_in(String strMsg) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(strMsg);
		String s = driver.findElement(errorMsg).getText();
		System.out.println();
		Assert.assertEquals(s,strMsg);
	}
	
	@And("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String strOption) throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(lnkDropdown).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    driver.findElement(lnkDropdownStack).sendKeys(Keys.ENTER);
	}
	
	@Then("The user should be redirected to Sign in page {string}")
	public void the_user_should_be_redirected_to_sign_in_page(String strLoginURL) {
		System.out.println(strLoginURL);
		String s = driver.getCurrentUrl();
		System.out.println();
		Assert.assertEquals(s,strLoginURL);
	}
	@When("The user clicks Register link")
	public void the_user_clicks_register_link() {
	   driver.findElement(lnkRegister).click();
	}

	@Then("The user should be redirected to Register form {string}")
	public void the_user_should_be_redirected_to_register_form(String strRegisterURL) {
		System.out.println(strRegisterURL);
		String s = driver.getCurrentUrl();
		System.out.println();
		Assert.assertEquals(s,strRegisterURL);
	}
	
	@Given("The user is on the Home Page")
	public void the_user_is_on_the_home_page() {
	}
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() throws InterruptedException {
		driver.findElement(lnkDropdownMainMenu).click();
		Thread.sleep(2000);
		driver.findElement(lnkDropdownGraph).click();	  
	}
	@Then("The user should be redirected to Graph page")
	public void the_user_should_be_redirected_to_graph_page() {
		System.out.println("Title : " + driver.getCurrentUrl());
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/",
				driver.getCurrentUrl());

}
}
