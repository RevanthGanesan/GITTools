import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
	// Converting one into another interface
	TakesScreenshot tk =(TakesScreenshot)d;
	File sc = tk.getScreenshotAs(OutputType.FILE);
	File desc = new File("C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\Screenshot\\Rev.png");
	FileUtils.copyFile(sc, desc);
	d.quit();

	
}
}
