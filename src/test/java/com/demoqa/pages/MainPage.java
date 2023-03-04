package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public final SelenideElement
            footerText = $(".kitt-footer-info"),
            language = $(".kitt-header__lang");

    public String getFooterText() {
        return footerText.getText();
    }

    public void clickLanguage(){
        language.click();
    }

    public String getLanguageText() {
        return language.getText();
    }
}