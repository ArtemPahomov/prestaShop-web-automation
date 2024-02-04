package com.prestashop.demo.page;

import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$x;

public class AddToShopCartPopUp implements Page {

    public static SelenideElement PROCEED_TO_CHECK_OUT_BTN = $x("//div[@class='cart-content-btn']//a");
    public static SelenideElement CONTINUE_SHOPPING_BTN = $x("//div[@class='cart-content-btn']//button");
}
