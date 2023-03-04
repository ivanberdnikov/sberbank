package com.demoqa.tests;

import com.demoqa.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class LanguageTest extends AbstractTest {
    @Test
    @DisplayName("Проверка открытия главной страницы")
    public void checkMainPageTest() {
        open("");
        MainPage mainPage = new MainPage();
        assertThat(mainPage.getFooterText()).contains("Россия, Москва, 117997, ул. Вавилова, 19");
    }

    @Test
    @DisplayName("Проверка смены языка на главной странице")
    public void checkLanguageTest() {
        open("");
        MainPage mainPage = new MainPage();
        mainPage.clickLanguage();
        assertThat(mainPage.getLanguageText()).contains("РУС");
    }
}