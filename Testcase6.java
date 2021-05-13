package selenium_demo;

import org.openqa.selenium.By;  
import java.util.List;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Testcase6 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
    	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
    			         
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org");  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 10000)"); 
        try {
        Thread.sleep(5000);
        System.out.print("Waits for 5 seconds and then again goes to top of the page");
        }catch(Exception e) {
        	e.printStackTrace();
        }
        driver.findElement(By.id("toTopHover")).click();
        
    }  
  
}