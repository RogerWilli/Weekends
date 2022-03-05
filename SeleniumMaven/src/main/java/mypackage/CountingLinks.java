package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://shopping.rediff.com");
		List<WebElement> links = c.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++); {
		System.out.println(links.get(i));
				
	}

}
