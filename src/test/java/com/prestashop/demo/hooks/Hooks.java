package com.prestashop.demo.hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {
    @Before
    public void prepareData() {
        SelenideLogger.addListener("allure", new AllureSelenide()
                .screenshots(true));
    }
}