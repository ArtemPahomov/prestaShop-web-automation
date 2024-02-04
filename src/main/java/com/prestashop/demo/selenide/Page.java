package com.prestashop.demo.selenide;

import com.codeborne.selenide.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public interface Page {
    Logger LOGGER = LoggerFactory.getLogger(Page.class);

    static <T> T at(Class<T> tClass) {
        return Selenide.page(tClass);
    }

    default void clickWhenEnabled(SelenideElement element) {
        isClickable(element).click();
    }

    default void clickWhenEnabled(SelenideElement element, Duration time) {
        isClickable(element, time).click();
    }

    default void setValueWhenEnabled(SelenideElement element, String value) {
        isClickable(element).setValue(value);
    }

    default SelenideElement isClickable(SelenideElement element) {
        WebElementCondition condition = and("Clickable", appear, enabled);
        LOGGER.debug("WebElement: {} should have the follow conditions: {}", element, condition);
        return element.shouldBe(condition);
    }

    default SelenideElement isClickable(SelenideElement element, Duration time) {
        WebElementCondition condition = and("Clickable", appear, enabled);
        LOGGER.debug("WebElement: {} should have the follow conditions: {}", element, condition);
        return element.shouldBe(condition, time);
    }
}
