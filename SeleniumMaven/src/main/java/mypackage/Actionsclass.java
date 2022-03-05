package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://www.snapdeal.com/");
		WebElement Mensfashion = c.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
		Actions a = new Actions(c);
		a.moveToElement(Mensfashion).build().perform();
		WebElement officebags = c.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[18]/a/span"));
		a.moveToElement(officebags).click().build().perform();
		WebElement leftslider = c.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
		a.dragAndDropBy(leftslider, 50, 0).build().perform();
	}

}
