import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Friday {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js =(JavascriptExecutor)d;
		WebElement down = d.findElement(By.xpath("//b[text()='Maven Dependencies']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		WebElement up = d.findElement(By.xpath("//h2[text()='Scope of Selenium Training in chennai:']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
				
	}
}
