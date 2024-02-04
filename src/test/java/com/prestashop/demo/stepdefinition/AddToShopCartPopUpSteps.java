package com.prestashop.demo.stepdefinition;

import com.prestashop.demo.page.AddToShopCartPopUp;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddToShopCartPopUpSteps extends AddToShopCartPopUp {

    @And("user continue shopping from Add item to shop cart pop-up")
    public void userContinueShopping() {
        Page.at(AddToShopCartPopUp.class).clickWhenEnabled(AddToShopCartPopUp.CONTINUE_SHOPPING_BTN);
    }

    @And("user move to shopping cart from pop-up")
    public void userMoveToShoppingCartFromPopUp() {
        Page.at(AddToShopCartPopUp.class).clickWhenEnabled(AddToShopCartPopUp.PROCEED_TO_CHECK_OUT_BTN);
    }
}
