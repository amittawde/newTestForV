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

import java.util.List;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class HomePage {

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

        List<WebElement> myElements = driver.findElements(By.xpath("//*[@class='block-header__heading']"));

        for(WebElement element:myElements) {

            if (element.getText().equalsIgnoreCase("Latest News")){
                return true;

            }
        }
        return false;
    }


    public void goToPage(String pageLinkName) {


        List<WebElement> menuElement = driver.findElements(By.xpath("//*[@class='icons glyph'][@data-icon='hamburger2']"));

        menuElement.get(0).click();


        List<WebElement> myElements = driver.findElements(By.xpath("//*[@class = 'navigation__menu__item']/a/span"));

        for(WebElement element:myElements) {

            if (element.getText().equalsIgnoreCase(pageLinkName)){
                element.click();
                break;
            }
        }

    }


    public String getH1Text() throws InterruptedException {

        String h1Text;

        Thread.sleep(3000);
        h1Text = driver.findElement(By.tagName("h1")).getText();
        return h1Text;

    }
}


