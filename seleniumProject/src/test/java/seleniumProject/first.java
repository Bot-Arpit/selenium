package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arpit\\eclipse-workspace\\seleniumProject\\src\\main\\resources\\Webdriver\\Chromedriver\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		driver.get("");
	}

}
