package part7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleget {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]"));
System.out.println("attribute value "+ele.getAttribute("class") );
System.out.println("text is"+ele.getText());
	}
	
}
