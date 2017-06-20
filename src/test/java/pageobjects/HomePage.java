package pageobjects;

import common.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by amittawade on 20/06/2017.
 */
public class HomePage {

    @FindBy(how = How.CSS, using = "Latest news")
    private WebElement latestNews;

    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='About']")
    private WebElement aboutPage;

    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='Work']")
    private WebElement workPage;

    @FindBy(how = How.XPATH, using = ".//*[@id='navigationMenuWrapper']/descendant::span[text()='Services']")
    private WebElement servicesPage;

    @FindBy(how = How.LINK_TEXT, using = "contactcities li a")
    private WebElement contactOfficesPage;

    public void IsLatestNews()
    {
        Assert.assertEquals("latest news", latestNews.getText().toLowerCase().trim());
    }


    public String getH1Title(String link) throws InterruptedException {
        System.out.println("Link name is " + link);
        String h1 ;
        if (link.toLowerCase("about")) {
            aboutPage.click();
        }
        if (link.toLowerCase( "work") ){
            workPage.click();
        }
        if (link.toLowerCase("services")){
            servicesPage.click();
        }
        Thread.sleep(3000);
        h1 = DriverManager.driver.findElement(By.tagName("h1")).getText();
        return h1;
    }

}
