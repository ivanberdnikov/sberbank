package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement userName = $("#userName");
    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement permanentAddress = $("#permanentAddress");
    private final SelenideElement submit = $("submit");

    public TextBoxPage clickSubmit() {
        submit.click();
        return this;
    }

    public TextBoxPage fillUserEmail(String Email) {
        userEmail.setValue(Email);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String address) {
        permanentAddress.setValue(address);
        return this;
    }

    public TextBoxPage fillUserName(String user) {
        userName.setValue(user);
        return this;
    }

    public TextBoxPage openTextBox() {
        open("/text-box");
        return this;
    }
}