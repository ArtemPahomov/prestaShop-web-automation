package com.prestashop.demo.stepdefinition;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.prestashop.demo.page.ShopCartPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ShopCartSteps extends ShopCartPage {
    @And("user proceed to checkout")
    public void userProceedToCheckout() {
        Page.at(ShopCartPage.class).clickWhenEnabled(ShopCartPage.CHECK_OUT_BTN);
    }

    @Then("user see order status as {string}")
    public void userSeeOrderStatusAs(String status) {
        Page.assertCondition(ShopCartPage.ORDER_STATUS, Condition.oneOfTexts(status));
    }

    @Then("user see shopping cart page is opened")
    public void userSeeShoppingCartPage() {
        Page.assertCondition(ShopCartPage.SHOP_CART_TITLE,Condition.text("Shopping Cart"));
    }

    @Then("user see {int} item in shopping cart")
    public void userSeeItemInShoppingCart(int uniqItem) {
        Page.assertCondition(ShopCartPage.ITEMS_IN_SHOP_CART,CollectionCondition.size(uniqItem));
    }

    @And("user delete item from shopping cart")
    public void userDeleteItemFromShoppingCart() {
        Page.at(ShopCartPage.class).clickWhenEnabled(ShopCartPage.DELETE_ITEM);
    }

    @Then("user see shopping cart is empty")
    public void userSeeShoppingCartIsEmpty() {
        Page.assertCondition(ShopCartPage.EMPTY_SHOP_CART_TITLE, Condition.exactText("There are no more items in your cart"));
    }
}
