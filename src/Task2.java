import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement txt = d.findElement(By.xpath("(//span[contains(@class,'testimonial-content')])[1]"));
		String text = txt.getText();
		System.out.println(text);
		d.quit();
		
	}

}
