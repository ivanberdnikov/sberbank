package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends AbstractTest {

    @Test
    void fillFormTest() {
        String userName = "userName";
        String userEmail = "userEmail@mail.ru";
        String currentAddress = "currentAddress";
        String permanentAddress = "permanentAddress";
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.openTextBox()
                .fillUserName(userName)
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