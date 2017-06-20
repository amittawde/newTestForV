package pageobjects;

import common.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@id='container']/div[2]/div[3]")
    private WebElement latestNews;

    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='About']")
    private WebElement aboutPage;

    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='Services']")
    private WebElement servicesPage;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='Work']")
    private WebElement workPage;

    

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public boolean IsLatestNews()
    {
        WebElement myElement = (new WebDriverWait(driver, 6)).until(ExpectedConditions.visibilityOf(latestNews));

        if (myElement.isDisplayed())
            return true;

        else
            return false;

    }


    public void goToPage(String pageLinkName) {

        if (pageLinkName.equals("ABOUT")) {
            aboutPage.click();
        }

        if (pageLinkName.equals("SERVICES")) {
            servicesPage.click();
        }

        if (pageLinkName.equals("WORK")) {
            workPage.click();
        }
    }


    public String getH1Text() throws InterruptedException {

        String h1Text;
        // System.out.println("Link name is " + link);

        Thread.sleep(3000);
        h1Text = driver.findElement(By.tagName("h1")).getText();
        return h1Text;

    }
}


