package com.prestashop.demo.page;

import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$x;

public class ItemPage implements Page {

    public static SelenideElement ADD_TO_CART_BTN = $x("//button[@data-button-action='add-to-cart']");
    public static SelenideElement PLUS_QUANTITY = $x("//button[@class='btn btn-touchspin js-touchspin bootstrap-touchspin-up']");

}