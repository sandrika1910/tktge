package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.UserLoginPage;

public class LoginPageSteps {
    UserLoginPage userLoginPage = new UserLoginPage();

    public LoginPageSteps clickOnRegisterNewAcc() {
        userLoginPage.userRegisterBtn.shouldBe(Condition.exist).click();
        return this;
    }
}
