package selenium_demo;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class seleniumscript {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
    	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
    			         
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 10000)");  
        
        
        // Click on the Search button 
        System.out.println("Moving to contact us page"); 
        driver.findElement(By.linkText("Contact Us")).click();

        
        // Click on the logo to go back to the home page
        System.out.println("Moving back to the home page");
        driver.findElement(By.className("col-md-6")).click();
        
    }  
  
}  


