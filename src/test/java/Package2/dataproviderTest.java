package Package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataproviderTest {

@Test
@Parameters({"Username","password"})

   public void Login(String username,String password) {

System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("");
	}

}







