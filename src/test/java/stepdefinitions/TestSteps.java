package stepdefinitions;

import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ContactPage;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class TestSteps implements En{

    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();

    public TestSteps() {

        Given("^I navigate to www\\.valtech\\.com$", () -> {
            driver.get("http://www.valtech.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        });


        Then("^Latest News section is displayed$", () -> {
            Assert.assertTrue("Latest news is displayed",homePage.IsLatestNews());

        });


        When("^I select menu item (.*)$", (String pageLink) -> {
            homePage.goToPage(pageLink);
        });


        Then("^H1 tag displays correct item (.*)$", (String h1Text) ->  {

            try {
                Assert.assertEquals(homePage.getH1Text(), h1Text);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        When("^I goto Contact page$", () -> {
            driver.get("https://www.valtech.com/about/contact-us/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        });

        Then("^I find (.*) of Valtech offices$", (String offices) -> {
            int numOffices = contactPage.numberOfOffices();

            if(numOffices > 0) {
                Assert.assertEquals("Total contact offices: ", numOffices, Integer.parseInt(offices));
            }

        });
    }
}
