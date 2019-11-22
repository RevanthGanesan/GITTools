import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		d.manage().window().maximize();
		WebElement a = d.findElement(By.id("credit1"));
		WebElement b = d.findElement(By.id("bank"));
		Actions ac = new Actions(d);
		ac.dragAndDrop(a, b).perform();
		
		
	}

}
