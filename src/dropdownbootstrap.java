import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownbootstrap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		WebElement ele=driver.findElement(By.xpath("//button[@id='menu1']"));
		ele.click();
		List<WebElement>options =driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li//a"));
		for(WebElement lst:options)
		{
			//System.out.println("list are"+lst.getText());
			
			if(lst.getText().equals("CSS"))
				
{
	lst.click();
	Thread.sleep(3000);
	System.out.println("clicked");
	break;
}
			
		}
			
	}

}
