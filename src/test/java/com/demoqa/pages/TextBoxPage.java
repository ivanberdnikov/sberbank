package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.components.TextBoxOutputForm;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    private final SelenideElement
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit");

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

    public TextBoxPage checkOutputText(String key, String value) {
        TextBoxOutputForm textBoxOutputForm = new TextBoxOutputForm();
        textBoxOutputForm.checkOutputText(key, value);

        return this;
    }
}