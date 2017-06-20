package common;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by amittawade on 20/06/2017.
 */
public class Hooks {

    @Before
    public void setUp() {
        new DriverManager().initialiseDriver();
        new DriverManager().openBrowser();
    }

    @After
    public void tearDown() {
        new DriverManager().closeBrowser();

    }
}
