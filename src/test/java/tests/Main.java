package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import data.UserAuthTestData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;
import steps.HomePageSteps;
import steps.LoginPageSteps;
import steps.UserRegisterPageSteps;
import testconfigs.BaseTestConfig;

public class Main extends BaseTestConfig {
    HomePageSteps homePageSteps = new HomePageSteps();
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    UserRegisterPageSteps userRegisterPageTest = new UserRegisterPageSteps();

    @BeforeSuite
    public void setUp() {
        super.setUp();
    }

    @Test
    public void userRegisterTest() {
        Selenide.open(Configuration.baseUrl);

        homePageSteps
                .acceptCookies()
                .tapLoginBtn();

        loginPageSteps.clickOnRegisterNewAcc();

        userRegisterPageTest
                .markPolicyCheckbox()
                .checkIfCheckboxIsChecked()
                .enterEmail(UserAuthTestData.WRONG_EMAIL)
                .clickOnRegisterBtn()
                .checkRegisterWithInvalidEmail()
                .clearInput()
                .enterEmail(UserAuthTestData.REAL_REGISTERED_EMAIL)
                .clickOnRegisterBtn()
                .checkIfErrorAlertIsAppear()
                .clearInput()
                .enterEmail(UserAuthTestData.REAL_UNUSED_EMAIL)
                .clickOnRegisterBtn()
                .checkRegisterWithValidEmail();

    }


    @AfterSuite
    public void tearDown() {
        super.tearDown();
    }

}
