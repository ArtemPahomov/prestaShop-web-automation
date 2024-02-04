package com.prestashop.demo.page;

import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$x;

public class NavigationMenu implements Page {

    public static SelenideElement DESKTOP_LOGO = $x("//div[@id='_desktop_logo']");

    public static SelenideElement CART_SHOP = $x("//div[@id='_desktop_cart']");
}
