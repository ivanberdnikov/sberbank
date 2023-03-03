package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public final SelenideElement
            footerText = $(".kitt-footer-info");

    public String getFooterText() {
        return footerText.getText();
    }
}