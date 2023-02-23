package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

    @Test
    public void dragAndDrop() {
        SelenideElement columnA = $("#column-a"), columnB = $("#column-b");

        open("https://the-internet.herokuapp.com/drag_and_drop");
        columnA.dragAndDropTo(columnB);
        columnA.shouldHave(Condition.text("B"));
    }
}