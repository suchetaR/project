package part4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
System.out.println("element is displayed status:"+email.isDisplayed());
System.out.println("element is enabled status :"+email.isEnabled());
System.out.println();
	}

}
