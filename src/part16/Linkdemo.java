package part16;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		//driver.findElement(By.partialLinkText("here")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of lins"+links.size());
		Iterator<WebElement> itr = links.iterator();
		
	}

}
