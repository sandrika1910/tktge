package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement
            navbarCategories = $("#categories-desktop-trigger"),
            navbarCategoriesDropDownElement = $("div[class='sc-95d0a086-1 fykYrs']"),
            acceptCookieBtn = $x("//button[text() = 'ვეთანხმები']"),
            loginBtn = $x("//span[text() = 'შესვლა']");
}
