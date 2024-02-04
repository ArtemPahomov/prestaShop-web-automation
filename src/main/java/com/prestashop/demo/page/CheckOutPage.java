package com.prestashop.demo.page;

import com.codeborne.selenide.SelenideElement;
import com.prestashop.demo.selenide.Page;

import static com.codeborne.selenide.Selenide.$x;

public class CheckOutPage implements Page {
    public static SelenideElement FIRST_NAME_FIELD_PERS_INFO = $x("//section[contains(@id,'personal-information')]//input[@id='field-firstname']");
    public static SelenideElement LAST_NAME_FIELD_PERS_INFO = $x("//section[contains(@id,'personal-information')]//input[@id='field-lastname']");
    public static SelenideElement CONFIRM_PERSONAL_INFO_BTN = $x("//button[@name='continue']");
    public static SelenideElement EMAIL_FIELD = $x("(//section[contains(@id,'checkout-personal-information-step')]//input[@id='field-email'])[1]");
    public static SelenideElement ADDRESS_FIELD = $x("//div[@id='delivery-address']//input[@id='field-address1']");
    public static SelenideElement POSTAL_CODE_FIELD = $x("//div[@id='delivery-address']//input[@id='field-postcode']");
    public static SelenideElement CITY_FIELD = $x("//div[@id='delivery-address']//input[@id='field-city']");
    public static SelenideElement COUNTRY_FIELD = $x("//select[@id='field-id_country']");
    public static SelenideElement PRIVACY_POLICY_AGREEMENT = $x("//input[@name='psgdpr']/parent::label");
    public static SelenideElement CUSTOMER_DATA_PRIVACY = $x("//input[@name='customer_privacy']/parent::label");
    public static SelenideElement CONFIRM_ADDRESS_INFO_BTN = $x("//button[@name='confirm-addresses']");
    public static SelenideElement FREE_DELIVERY_RADIO_BTN = $x("//label[@for='delivery_option_1']");
    public static SelenideElement CONFIRM_DELIVERY_BTN = $x("//button[@name='confirmDeliveryOption']");
    public static SelenideElement PAY_BY_CHECK_RADIO_BTN = $x("//label[@for='payment-option-3']");
    public static SelenideElement TERMS_OF_SERVICE_AGREEMENT = $x("//label[@for='conditions_to_approve[terms-and-conditions]']");
    public static SelenideElement PLACE_ORDER_BTN = $x("//div[@id='payment-confirmation']//button");

}
