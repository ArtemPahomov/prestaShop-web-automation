package com.prestashop.demo.stepdefinition;

import com.prestashop.demo.page.ItemPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;

public class ItemSteps extends ItemPage {

    @And("user add item to shopping cart")
    public void userAddItemToShoppingCart() {
        Page.at(ItemPage.class).clickWhenEnabled(ItemPage.ADD_TO_CART_BTN);
    }
}
