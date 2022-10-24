

package Selenium_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
  
    public static void main( String[] args )throws
    InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Chomedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    WebElement buscar = driver.findElement(By.id("twotabsearchtextbox"));
    buscar.sendKeys("Magic Cards");
    buscar.submit();
    Thread.sleep(5000);
     driver.quit();
    }
    }