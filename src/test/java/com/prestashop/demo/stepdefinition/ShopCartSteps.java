package com.prestashop.demo.stepdefinition;

import com.codeborne.selenide.*;
import com.prestashop.demo.page.ShopCartPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class ShopCartSteps extends ShopCartPage {
    @And("user proceed to checkout")
    public void userProceedToCheckout() {
        Page.at(ShopCartPage.class).clickWhenEnabled(ShopCartPage.CHECK_OUT_BTN);
    }

    @Then("user see order status as {string}")
    public void userSeeOrderStatusAs(String status) {
        Assertions.assertThat(ShopCartPage.ORDER_STATUS.getText()).containsIgnoringCase(status);
    }

    @Then("user see shopping cart page is opened")
    public void userSeeShoppingCartPage() {
        Assertions.assertThat(ShopCartPage.SHOP_CART_TITLE.getText()).isEqualToIgnoringCase("Shopping Cart");
    }

    @Then("user see {int} item in shopping cart")
    public void userSeeItemInShoppingCart(int uniqItem) {
        Assertions.assertThat(ShopCartPage.ITEMS_IN_SHOP_CART).hasSize(uniqItem);
    }

    @And("user delete item from shopping cart")
    public void userDeleteItemFromShoppingCart() {
        Page.at(ShopCartPage.class).clickWhenEnabled(ShopCartPage.DELETE_ITEM);
    }

    @Then("user see shopping cart is empty")
    public void userSeeShoppingCartIsEmpty() {
        Assertions.assertThat(ShopCartPage.EMPTY_SHOP_CART_TITLE.getText()).isEqualToIgnoringCase("There are no more items in your cart");
    }
}
