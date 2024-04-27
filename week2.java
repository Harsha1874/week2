import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/indian-holidays/-tour-packages/details/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		
		WebElement customerLogin =	driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='Customer Login'])[2]"));
		builder.moveToElement(customerLogin).perform();
		WebElement register = driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Register'])[2]"));
		register.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@id='acc_first_name'])[1]"));
		firstName.sendKeys("Harsha");
		WebElement lastName = driver.findElement(By.xpath("(//input[@id='acc_last_name'])[1]"));
		lastName.sendKeys("Vardhan");
		WebElement email = driver.findElement(By.xpath("(//input[@id='acc_user_email'])[1]"));
		email.sendKeys("lilharsha2004@gmail.com");
		WebElement setpass = driver.findElement(By.xpath("(//input[@id='acc_user_password'])[1]"));
		setpass.sendKeys("Harsha1874");
		WebElement cnfpass = driver.findElement(By.xpath("(//input[@id='acc_user_passconf'])[1]"));
		cnfpass.sendKeys("Harsha1874");
		WebElement phone = driver.findElement(By.xpath("(//input[@id='acc_mobile_no'])[1]"));
		phone.sendKeys("8519975114");
		WebElement registerBtn = driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]"));
		registerBtn.click();
		Thread.sleep(5000);
		driver.close();		
}
}
