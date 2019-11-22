import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver f = new ChromeDriver();
	f.get("https://www.facebook.com/");
	//to
	f.navigate().to("https://www.google.com/");
	//back
	f.navigate().back();
	//forward
	f.navigate().forward();
	//refresh
	f.navigate().refresh();
	f.quit();
}
}
