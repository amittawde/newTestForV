package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amittawade on 20/06/2017.
 */
public class DriverManager {

    public static WebDriver driver;

    public void initialiseDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/java/common/chromedriver");

        driver = new ChromeDriver();
    }

    public void openBrowser() {
        //driver.get("http://www.bbc.co.uk");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
