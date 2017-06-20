package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class ContactPage {

    public void numberOfOffices() {

        List<WebElement> offices = driver.findElements(By.cssSelector("#container>section div ul  li"));
        System.out.print("Number of offices :" + offices.size());

    }
}
