

package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
  
    public static void main( String[] args )throws
    InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Chomedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    
    Thread.sleep(5000);
     driver.quit();
    }
    }