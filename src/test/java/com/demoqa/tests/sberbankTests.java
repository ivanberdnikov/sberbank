package com.demoqa.tests;

import com.codeborne.selenide.Selenide;
import com.demoqa.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class sberbankTests extends AbstractTest {
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

    @Test
    @DisplayName("Проверка нажатия кнопок в блоке Лучшие Предложения")
    public void bestOffersTest() {
        open("");
        MainPage mainPage = new MainPage();
        mainPage.clickBestOffer("Финансы")
                .clickBestOffer("Пенсионерам")
                .clickBestOffer("Молодёжи")
                .clickBestOffer("Родителям и детям")
                .clickBestOffer("Премиум");
        //TODO Дописать проверки в тесте
        Selenide.sleep(10000);
    }
}