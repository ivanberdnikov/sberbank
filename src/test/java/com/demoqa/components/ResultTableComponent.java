package com.demoqa.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultTableComponent {
    private final String TITLE_TEXT = "Thanks for submitting the form";
    private final SelenideElement
            title = $("#example-modal-sizes-title-lg"),
            table = $(".table-responsive");

    public ResultTableComponent isTitleVisible() {
        title.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public ResultTableComponent checkResult(String key, String value) {
        table.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}