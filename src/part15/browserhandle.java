package part15;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\admin\\Desktop\\selenium_library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		//String parentw=driver.getWindowHandle();
		//System.out.println("id is"+parentw );
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windowids = driver.getWindowHandles();
		 Iterator<String> ids = windowids.iterator();
		 String pw = ids.next();
		 String cw = ids.next();
		 System.out.println("pw is"+pw);
		 System.out.println("cw is"+cw);
		driver.switchTo().window(pw);
		System.out.println("parent window title"+driver.getTitle());
		 
		 driver.switchTo().window(cw);
		 String title = driver.getTitle();
		 System.out.println("cw title is"+title);
		 if(title.equals("Guru99 Bank Home Page"))
		 {
			 driver.close();
		 }
		 
		 

	}

}
