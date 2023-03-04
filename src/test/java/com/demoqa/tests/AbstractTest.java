package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class AbstractTest {

    @BeforeAll
    static void configuration() {
        Configuration.baseUrl = "http://www.sberbank.ru/";
    }

    @AfterEach
    void closeDriver() { Selenide.closeWebDriver(); }
}