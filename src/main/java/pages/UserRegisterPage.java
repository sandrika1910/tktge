package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserRegisterPage {
    public SelenideElement registerAccWindow = $(".sc-42be4358-1.lmaOXB");

    public SelenideElement
            alertForUsedMailRegister = $(".Toastify__toast.Toastify__toast--error"),
            registerBtn = $(".sc-50cca696-0.sc-50cca696-1.fjATym.eBXYul"),
            emailInput = $("input[type='email']"),
            acceptPolicyCheckBox = $(".sc-446775f8-0.lmjhKB").$("span");

}
