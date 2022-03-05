package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	String Browsername = "chrome";
	WebDriver browser;
@BeforeTest
public void precondition() {
	System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
    if(Browsername.equalsIgnoreCase("CHROME") ) {
    	 browser = new ChromeDriver();
    }else if (Browsername.equalsIgnoreCase("FIREFOX")) {
    	FirefoxDriver f = new FirefoxDriver();
    }else if (Browsername.equalsIgnoreCase("Edge")) {
    	EdgeDriver e = new EdgeDriver();
    }else {
    	System.out.println("The code currently supports only"
    			+"Chrome"
    			+"please select valid option");
    }
}
@Test(priority = 1)
public void openurl() {
	String ExpectedResult = "Login - PHPTRAVELS";
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/login");
	Assert.assertEquals(browser.getTitle(), ExpectedResult);
}
@AfterTest
public void closebrowser() {
	//browser.close();
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void EnterCredentials() {
	String ExpectedResult = "Dashboard - PHPTRAVELS";
	browser.findElement(By.name("email")).sendKeys("user@phptravels.com");
	browser.findElement(By.name("password")).sendKeys("demouser");
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), ExpectedResult);
}
}
