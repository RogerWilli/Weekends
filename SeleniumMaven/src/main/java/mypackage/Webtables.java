package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rogerwilliams/Downloads//chromedriver");	
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("httpWebElementrediff.com/gainers");
		List<WebElement> companynames = c.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr/td"));
		for(int i=0;<companynames.size();i++) {
			System.out.println(companynames.get(i).getText());
		}
	}

}
