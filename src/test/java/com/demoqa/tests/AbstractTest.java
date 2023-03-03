package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class AbstractTest {

    @BeforeAll
    static void configuration() {
        Configuration.baseUrl = "http://www.sberbank.ru/";
    }
}