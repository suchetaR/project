package part14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxDemo {
public static void main(String args[])
{                                                                   
	System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	//driver.findElement(By.id("vfb-6-0")).click();
	List<WebElement> checkbx = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println("size is"+checkbx.size());
	//for(WebElement chx:checkbx)
	//{
		//String name=chx.getAttribute("value");
		//if(name.equals("checkbox1")|| name.equals("checkbox"))
	//	{
		//	chx.click();
	//	}
		
	// last 2 select
	//for(int i=checkbx.size()-2;i<checkbx.size();i++)
//	{
	//	checkbx.get(i).click();
//}
	//for first 2
	for(int i=0;i<checkbx.size()-1;i++)
	{
		checkbx.get(i).click();;
	}
	
}
}
