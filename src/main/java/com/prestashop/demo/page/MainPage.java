package com.prestashop.demo.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage implements Page {

    public static ElementsCollection POPULAR_PRODUCTS = $$x("//div[@class='products row']/div");
    public static SelenideElement PRODUCT_TITLE = $x("//section[@class='featured-products clearfix']/h2");

    public MainPage open() {
        Selenide.open("https://demo.prestashop.com");
        Selenide.switchTo().frame($x("//iframe[@id='framelive']"));
        return this;
    }
}
