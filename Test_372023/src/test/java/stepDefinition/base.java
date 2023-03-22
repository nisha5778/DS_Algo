package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver baseClassDriver = new FirefoxDriver();
	//public static WebDriver baseClassDriver = new ChromeDriver();

	public static String loginScreenURL = "https://dsportalapp.herokuapp.com/login";
	public static String basicURL = "https://dsportalapp.herokuapp.com/";
	public static String userName = "manas";
	public static String password = "nishamanas";
	public static ChromeOptions chromeOptions = new ChromeOptions();
	
	public static void initializeOption(){
		System.out.println("in base class....");
	chromeOptions.addArguments("--ignore-certifcate-errors");	
	chromeOptions.addArguments("test-type");
	//driver = new InternetExplorerDriver();
	//driver = new FirefoxDriver();
	baseClassDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	baseClassDriver.manage().window().maximize();	
	}
}
