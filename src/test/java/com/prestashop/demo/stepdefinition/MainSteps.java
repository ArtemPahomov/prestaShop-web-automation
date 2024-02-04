package com.prestashop.demo.stepdefinition;

import com.codeborne.selenide.WebElementsCondition;
import com.prestashop.demo.page.MainPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

import java.time.Duration;
import java.util.Random;

public class MainSteps extends MainPage {
    @Given("user open main page")
    public void userOpenMainPage() {
        Page.at(MainPage.class).open();
    }

    @And("user open first popular product")
    public void userOpenFirstPopularProduct() {
        Page.at(MainPage.class).clickWhenEnabled(MainPage.POPULAR_PRODUCTS.get(0), Duration.ofSeconds(15));
    }

    @And("user open one more item")
    public void userOpenOneMoreItem() {
        Page.at(MainPage.class).clickWhenEnabled(MainPage.POPULAR_PRODUCTS.get(new Random().nextInt((MainPage.POPULAR_PRODUCTS.size()))));
    }

    @Then("user see banner on main page")
    public void userSeeBannerOnMainPage() {
        Assertions.assertThat(MainPage.PRODUCT_TITLE.getText()).containsIgnoringCase("Popular Products");
    }
}
