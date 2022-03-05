package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinggroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://echoecho.com/htmlforms09.htm");
		List<WebElement> checkboxes = c.findElements(By.name("Checkbox"));
		System.out.println(checkboxes.size());
		//checkboxes.get(1).click();
		for(int i=0;i<checkboxes.size();i++) {
			System.out.println(checkboxes.get(i).getAttribute("checked"));
		}
	}

}
