package part6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplefindelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
//ele.sendKeys("suchrn@gmail.com");
//WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
//password.sendKeys("dadusuyog");
//WebElement sub=driver.findElement(By.name("login"));
//sub.click();

List<WebElement>ele =driver.findElements(By.xpath("//body/div[@id='u_0_3_a0']/div[@id='globalContainer']/div[2]//a"));
System.out.println(ele.size());

	}

}
