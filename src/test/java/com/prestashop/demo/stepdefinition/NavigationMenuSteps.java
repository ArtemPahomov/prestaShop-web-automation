package com.prestashop.demo.stepdefinition;

import com.prestashop.demo.page.NavigationMenu;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NavigationMenuSteps {
    @And("user open shopping cart page")
    public void userOpenShopCartPage() {
        Page.at(NavigationMenu.class).clickWhenEnabled(NavigationMenu.CART_SHOP);
    }

    @And("user go to main page")
    public void userGoToMainPage() {
        Page.at(NavigationMenu.class).clickWhenEnabled(NavigationMenu.DESKTOP_LOGO);
    }
}
