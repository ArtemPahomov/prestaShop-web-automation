package com.prestashop.demo.stepdefinition;

import com.codeborne.selenide.Condition;
import com.prestashop.demo.page.MainPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
        Page.at(MainPage.class).clickWhenEnabled(MainPage.POPULAR_PRODUCTS.get(new Random().nextInt(2,(MainPage.POPULAR_PRODUCTS.size()))));
    }

    @Then("user see banner on main page")
    public void userSeeBannerOnMainPage() {
        Page.assertCondition(MainPage.PRODUCT_TITLE, Condition.exactText("Popular Products"));
    }
}
