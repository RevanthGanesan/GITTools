import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://greenstech.in/selenium-course-content.html");
		d.manage().window().maximize();
		WebElement btnCourse = d.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(d);
		a.moveToElement(btnCourse).perform();
		WebElement c = d.findElement(By.xpath("//span[text()='Oracle Training ']"));
		a.moveToElement(c).perform();
		WebElement e = d.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		e.click();
		d.quit();
		
	}

}
