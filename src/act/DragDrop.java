package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Action\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement src=driver.findElement(By.xpath("//li[@id='fourth'][2]"));
	WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions a=new Actions(driver);
a.dragAndDrop(src, des).perform();
System.out.println("HIIII");
}

}
