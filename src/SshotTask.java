import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SshotTask {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	d.manage().window().maximize();
	TakesScreenshot t =(TakesScreenshot)d;
	File scr = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\Screenshot\\Revanth.png");
	FileUtils.copyFile(scr, dest);
	d.quit();
}
}
