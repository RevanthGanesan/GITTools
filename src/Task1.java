import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		r.get("http://www.greenstechnologys.com/");
		WebElement Contact = r.findElement(By.xpath("//a[@href='contact.php']"));
		Contact.click();
		WebElement Name = r.findElement(By.id("InputName"));
		Name.sendKeys("Revanth");
		WebElement mobile_number = r.findElement(By.id("InputSubject"));
		mobile_number.sendKeys("1234567890");
		WebElement Email = r.findElement(By.id("InputEmail1"));
		Email.sendKeys("revanth@gmail.com");
		WebElement Course = r.findElement(By.name("courses"));
		Course.sendKeys("Selenium");
		WebElement Msg = r.findElement(By.name("comments"));
		Msg.sendKeys("Hai");
		WebElement Sub = r.findElement(By.name("submit"));
		Sub.click();
		r.quit();
		
		
	}

}
