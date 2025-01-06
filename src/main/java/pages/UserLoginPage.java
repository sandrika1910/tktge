package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserLoginPage {
    public SelenideElement
            userRegisterBtn = $x("//span[text() = 'რეგისტრაცია']");
}
