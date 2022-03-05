package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://echoecho.com/htmlforms09.htm");
		c.findElement(By.name("option3")).click();
	}

}
