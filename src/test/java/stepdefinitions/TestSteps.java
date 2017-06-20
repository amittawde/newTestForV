package stepdefinitions;

import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ContactPage;
import pageobjects.HomePage;

import static common.DriverManager.driver;

/**
 * Created by amittawade on 20/06/2017.
 */
public class TestSteps implements En{

    HomePage homePage;
    ContactPage contactPage;

    public TestSteps() {

        Given("^I navigate to www\\.valtech\\.com$", () -> {
            driver.get("http://www.valtech.com");
        });

        Then("^Latest News section is displayed$", () -> {
            homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.IsLatestNews();
        });

        When("^I select About$", () -> {

        });

        Then("^verify that H1 tag displays About$", () -> {

        });

        When("^I select Services$", () -> {

        });

        Then("^verify that H(\\d+) tag displays Services$", (Integer arg1) -> {

        });

        When("^I select Work$", () -> {

        });

        Then("^verify that H(\\d+) tag displays Work$", (Integer arg1) -> {

        });

        When("^I goto Contact page$", () -> {
            contactPage = PageFactory.initElements(driver, ContactPage.class);
        });

        Then("^I find the number of Valtech offices$", () -> {
            contactPage.numberOfOffices();

        });
    }
}
