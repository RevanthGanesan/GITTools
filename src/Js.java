import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		//typecast using
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement name = d.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','987456321')", name);
		WebElement pass = d.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Revanth')", pass);
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", name);
		// typecase for object
		String s = (String)obj;
		System.out.println(s);
		Object obj1 = js.executeScript("return arguments[0].getAttribute('value')", pass);
		String s1 = (String)obj1;
		System.out.println(s1);
		WebElement btn = d.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", btn);
		
	}

}
