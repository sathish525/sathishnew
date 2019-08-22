package Training.org.cts.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static  WebDriver driver;
	
	public static WebDriver getDriver() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish\\eclipse-workspace\\org.tcs.test\\driver\\chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	return driver;
	 
	 
	}

	public static void url(String url) {
		
		driver.get(url);
	}
	public static void fill(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}public static void buttonclick(WebElement element) {
		
		element.click();
		}

	public static void switcdriverng() {
		
		String io=driver.getWindowHandle();
		
	Set<String> pop=driver.getWindowHandles();

	for(String k:pop) {
		if(!k.equals(io)) {
			
			driver.switchTo().window(k);
		}
		
		
		
	}
	 }
	public  static void numberOfWindow(int k) {
		
		String io=driver.getWindowHandle();
		
		Set<String> pop=driver.getWindowHandles();

	 List<String> ji=new ArrayList();
	 
				String y = ji.get(k);
				
				driver.switchTo().window(y);
				
	}

	public static void text(WebElement element) {
		
	String text =element.getText();
	System.out.println(text);	
	}

	public static void ddvalue(WebElement element,String value)

	{
	    Select s=new Select(element);
		s.selectByValue(value);
		}

	public static void ddIndex(WebElement element,int Index)

	{

		Select s=new Select(element);
		s.selectByIndex(Index);
			
			
		}

	public static void ddText(WebElement element,String text) 
		{

			Select s=new Select(element);
			s.selectByVisibleText(text);
			}



	public static void getattribute(WebElement element){
		
		
		String s=element.getAttribute("value");
		System.out.println(s);
		
		
		
	}


}
