package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class ContactPage {


    @FindBy(how = How.LINK_TEXT, using = "contactcities li a")
    private WebElement contactPage;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    public void numberOfOffices() {

        List<WebElement> offices = driver.findElements(By.cssSelector("#container>section div ul  li"));
        System.out.print("Number of offices:" + offices.size());

    }
}
