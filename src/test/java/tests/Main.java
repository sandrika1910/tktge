package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import testconfigs.BaseTestConfig;

public class Main extends BaseTestConfig {

    @BeforeSuite
    public void setUp() {
        super.setUp();
    }

    @AfterSuite
    public void tearDown() {
        super.tearDown();
    }

}
