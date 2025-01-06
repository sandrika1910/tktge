package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import pages.UserRegisterPage;

public class UserRegisterPageSteps {
    UserRegisterPage userRegisterPage = new UserRegisterPage();

    public UserRegisterPageSteps markPolicyCheckbox() {
        userRegisterPage.acceptPolicyCheckBox.shouldBe(Condition.exist).click();
        return this;
    }

    public UserRegisterPageSteps checkIfCheckboxIsChecked() {
        userRegisterPage.registerBtn.shouldNotBe(Condition.disabled);
        return this;
    }

    public UserRegisterPageSteps clearInput() {
        int length = userRegisterPage.emailInput.getValue().length();
        if (length > 1) {
            for (int i = 0; i < length; i++) {
                userRegisterPage.emailInput.sendKeys(Keys.BACK_SPACE);
            }
        }
        return this;
    }

    public UserRegisterPageSteps clickOnRegisterBtn() {
        userRegisterPage.registerBtn.click();
        return this;
    }

    public UserRegisterPageSteps checkRegisterWithValidEmail() {
        userRegisterPage.registerAccWindow.should(Condition.disappear);
        return this;
    }

    public UserRegisterPageSteps checkRegisterWithInvalidEmail() {
        userRegisterPage.registerAccWindow.shouldNot(Condition.disappear);
        return this;
    }

    public UserRegisterPageSteps enterEmail(String email) {
        userRegisterPage.emailInput.sendKeys(email);
        return this;
    }

    public UserRegisterPageSteps checkIfErrorAlertIsAppear() {
        userRegisterPage.alertForUsedMailRegister.should(Condition.appear);
        return this;
    }

}
