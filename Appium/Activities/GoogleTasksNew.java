package activities;

	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
		public class GoogleTasksNew {
			 AppiumDriver<MobileElement> driver = null;
		        WebDriverWait wait;
			    
			    @BeforeClass
			    public void beforeClass() throws InterruptedException, IOException {
			        // Set the Desired Capabilities
			        DesiredCapabilities caps = new DesiredCapabilities();
			        caps.setCapability("deviceName", "Pixel4Emulator");
			        caps.setCapability("platformName", "Android");
			        caps.setCapability("automationName","UiAutomator2");
			        caps.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
			        caps.setCapability("appActivity", ".NexusLauncherActivity");
			        caps.setCapability("noReset", true);
   
			        // Instantiate Appium Driver
			        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
			        driver = new AndroidDriver<MobileElement>(appServer, caps);
			      //  wait = new WebDriverWait(driver, 30);
			    }
			    @Test
			    public void testngAsserts() throws Exception {
			    	String[] tasksToAdd = {
			    			"Complete Activity with Google Tasks",
			    			"Complete Activity with Google Keep",
			    			"Complete the second Activity Google Keep"
			    	};
			    	for(String taskToAdd : tasksToAdd) {
			    		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("Tasks")));
			    		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("Tasks")));
			    		driver.findElementById("Tasks").click();
			    		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/tasks_refresh_empty_scrollable")));
			    		driver.findElementById("com.google.android.apps.tasks:id/tasks_refresh_empty_scrollable").sendKeys(tasksToAdd);
			    		driver.findElementById("add_task_done").click();
			    	}
			    	wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
			    	List<MobileElement> tasksAdded = driver.findElementsById("task_name");
			    	Assert.assertEquals(tasksAdded.size(),3);
			    	Assert.assertEquals(tasksAdded.get(2).getText(),"Complete Activity with Google Tasks");
			    }
			    @AfterClass
			    public void tearDown() {
			    	driver.quit();
			    }
}
