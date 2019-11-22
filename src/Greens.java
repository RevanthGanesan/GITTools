import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement para = m.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As')]"));
		String name = para.getText();
		System.out.println(name);
		m.quit();
		
		
	}

}
