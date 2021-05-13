package selenium_demo;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
  
public class Testcase2 {  
  
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
        js.executeScript("scrollBy(0, 5000)");  
        
       // going to Expert Mentor in join us         
        driver.findElement(By.linkText("Expert Mentor")).click();
        
        WebElement name = driver.findElement(By.name("Name"));
        WebElement email = driver.findElement(By.name("Email"));
        
        name.sendKeys("Pooja");
        email.sendKeys("poojakatakam101@gmail.com");
        
        
        Select login_select=new Select(driver.findElement(By.className("form-control")));

        login_select.selectByVisibleText("Expert Mentor");
        WebElement login=driver.findElement(By.cssSelector("input[type=submit]"));
        login.click();
        
        
        
    }  
  
}