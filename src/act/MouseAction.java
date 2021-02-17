package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Action\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement boxCor=driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(boxCor).perform();
		WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		
		a.moveToElement(oracle).perform();
		
	}

}
