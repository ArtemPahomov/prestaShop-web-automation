package com.prestashop.demo.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ShopCartPage implements Page {

    public static SelenideElement CHECK_OUT_BTN = $x("//div[contains(@class,'checkout cart')]/div");
    public static SelenideElement ORDER_STATUS = $x("//section[@id='content-hook_order_confirmation']//h3");
    public static SelenideElement SHOP_CART_TITLE = $x("//div[@class='card cart-container']//h1");
    public static SelenideElement EMPTY_SHOP_CART_TITLE = $x("//div[@class='card cart-container']//span");
    public static SelenideElement DELETE_ITEM = $x("//a[@class='remove-from-cart']");
    public static ElementsCollection ITEMS_IN_SHOP_CART = $$x("//div[@class='cart-overview js-cart']//li");
}
