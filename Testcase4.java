package selenium_demo;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Testcase4 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
    	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
    			         
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 100000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 100000)");  
        
        
        // Click on the visit now button 
        System.out.println("Moving to Grip in Linkedin"); 
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/the-sparks-foundation/']")).click();
        		
        	
        
    }  
  
}  

