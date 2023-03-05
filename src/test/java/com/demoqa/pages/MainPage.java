package com.demoqa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private final SelenideElement
            footerText = $(".kitt-footer-info"),
            language = $(".kitt-header__lang");
    private final ElementsCollection bestOffer = $$(".ts-container__tab");

    public MainPage clickBestOffer(String value) {
        SelenideElement offer = bestOffer.findBy(text(value));
        offer.click();

        return this;
    }

    public String getFooterText() { return footerText.getText(); }

    public void clickLanguage() { language.click(); }

    public String getLanguageText() { return language.getText(); }
}