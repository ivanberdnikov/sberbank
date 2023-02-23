package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends AbstractTest {

    @Test
    void fillFormTest() {
        Faker faker = new Faker();
        String userName = faker.name().username();
        String userEmail = userName + "@mail.ru";
        String currentAddress = faker.address().fullAddress();
        String permanentAddress = faker.address().secondaryAddress();
        TextBoxPage textBoxPage = new TextBoxPage();
        open("/text-box");
        executeJavaScript("$('footer').remove();");
        textBoxPage.fillUserName(userName)
                .fillUserEmail(userEmail)
                .fillCurrentAddress(currentAddress)
                .fillPermanentAddress(permanentAddress)
                .clickSubmit()
                .checkOutputText("Name:", userName)
                .checkOutputText("Email:", userEmail)
                .checkOutputText("Current Address :", currentAddress)
                .checkOutputText("Permananet Address :", permanentAddress);
    }
}