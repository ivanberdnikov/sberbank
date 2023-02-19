package com.demoqa.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxOutputForm {

    public TextBoxOutputForm checkOutputText(String key, String value) {
        $("#output").$(byText(key)).shouldHave(text(value));

        return this;
    }
}