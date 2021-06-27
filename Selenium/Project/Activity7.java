package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;

	@BeforeMethod
	 public void beforeMethod() {
		driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	@Test
    public void exampleTestCase() throws InterruptedException {
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();
       /*WebElement drop= driver.findElement(By.xpath("//a[@id='grouptab_0']"));
        		Select dropdown = new Select(drop);
        		dropdown.selectByVisibleText("Leads");*/
        Thread.sleep(3000);
        		driver.findElement(By.id("adspan_218434a9-eeae-6b4b-1518-5fe045e83b3f")).click();
        		Thread.sleep(5000);
        		//WebElement l = driver.findElement(By.linkText("9999999999")).getText();
        		Thread.sleep(2000);
        	     //   System.out.println("Src Attribute is: "+ l.getText());
        	        String s = driver.findElement(By.xpath("//*[@id=\'ui-id-11\']/span")).getText();
        	        System.out.println("Mobile--"+s);
        		
        		/*driver.findElement(By.xpath"(//span[@class='phone'])[1]")).getText();
        		System.out.println();*/
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(10000);
      
}
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	}
}
