package Test_Frenzy_Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitialConfigs extends Variables {
	static WebDriver driver;
	@Test(testName="Open Browser", description="Abrir el navegador",priority=1)
	public void OpenBrowser() {
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilan\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		//Abrir el navegador
		driver = new ChromeDriver();
		System.out.println("Se Abrio el navegador");
		driver.manage().window().maximize();
	}
}