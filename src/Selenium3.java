import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement fname = d.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Revanth");
		WebElement ssur = d.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
		ssur.sendKeys("Bazz");
		WebElement rbtn = d.findElement(By.className("_8esa"));
		rbtn.click();
		d.quit();
		
		
	}

}
