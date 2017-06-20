import common.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by amittawade on 20/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@test1")
public class CucumberRun {

    /*
    @BeforeClass
    public static void setup(){

        new DriverManager().initialiseDriver();
        new DriverManager().openBrowser();
    }

    @AfterClass
    public static void teardown(){

        new DriverManager().closeBrowser();
    }
    */
}
