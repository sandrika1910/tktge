package testconfigs;

import static com.codeborne.selenide.Configuration.*;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTestConfig {

    protected void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserCapabilities = options;
        browserSize = null;
        baseUrl = "https://tkt.ge/";
        timeout = 5000;
        pageLoadTimeout = 15000;
        holdBrowserOpen = false;
        reopenBrowserOnFail = true;
        savePageSource = false;
        fastSetValue = true;
    }

    protected void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

}
