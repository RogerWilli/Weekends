package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("http://register.rediff.com/register/register.php?FormName=user_details");
		//c.findElement(By.name("dropdownmenu")).sendKeys("Milk");
		WebElement location = c.findElement(By.id("country"));
		location.sendKeys("Finland");
		List<WebElement> countrynames = location.findElements(By.tagName("option"));
		for(int i=0;i<countrynames.size();i++) {
			System.out.print(countrynames.get(i).getText()+"--->");
			System.out.println(countrynames.get(i).getAttribute("selected"));
		}
	}

}
