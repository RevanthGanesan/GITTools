import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver q = new ChromeDriver();
		q.get("https://www.redbus.in/");
		WebElement Prof = q.findElement(By.className("icon-profile-new-unsigned "));
		Prof.click();
		//WebElement SignIn = q.findElement(By.id("signInLink"));
		//SignIn.click();
		
	}
	

}
