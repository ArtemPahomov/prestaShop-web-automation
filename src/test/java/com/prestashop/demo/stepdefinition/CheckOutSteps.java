package com.prestashop.demo.stepdefinition;

import com.prestashop.demo.factories.OrderDetailsFactory;
import com.prestashop.demo.models.OrderDetails;
import com.prestashop.demo.page.CheckOutPage;
import com.prestashop.demo.selenide.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Locale;

public class CheckOutSteps extends CheckOutPage {
    private OrderDetails orderDetails;

    @And("user set first name in personal info block")
    public void userSetFirstNameInPersonalInfoBlock() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.FIRST_NAME_FIELD_PERS_INFO, orderDetails.getFirstName());
    }

    @And("user set last name in personal info block")
    public void userSetLastNameInPersonalInfoBlock() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.LAST_NAME_FIELD_PERS_INFO, orderDetails.getLastName());
    }

    @And("user set email in personal info block")
    public void userSetEmailInPersonalInfoBlock() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.EMAIL_FIELD, orderDetails.getEmail());
    }

    @And("user confirm agreements")
    public void userConfirmAgreements() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.PRIVACY_POLICY_AGREEMENT);
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.CUSTOMER_DATA_PRIVACY);
    }

    @And("user click continue button in personal info block")
    public void userClickContinueButton() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.CONFIRM_PERSONAL_INFO_BTN);
    }

    @And("user set address")
    public void userSetAddress() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.ADDRESS_FIELD, orderDetails.getAddress());
    }

    @And("user set Postal code")
    public void userSetPostalCode() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.POSTAL_CODE_FIELD, orderDetails.getPostalCode());
    }

    @And("user set city")
    public void userSetCity() {
        Page.at(CheckOutPage.class).setValueWhenEnabled(CheckOutPage.CITY_FIELD, orderDetails.getCity());
    }

    @And("there was order details created")
    public void thereWasOrderDetailsCreated() {
        OrderDetailsFactory orderDetailsFactory = new OrderDetailsFactory(Locale.FRANCE);
        orderDetails = orderDetailsFactory.createOrderDetails();
    }

    @And("user click continue button in address info block")
    public void userClickContinueButtonInAddressInfoBlock() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.CONFIRM_ADDRESS_INFO_BTN);
    }

    @And("user choose free delivery")
    public void userChooseFreeDelivery() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.FREE_DELIVERY_RADIO_BTN);
    }

    @And("user choose pay by check")
    public void userChoosePayByCheck() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.PAY_BY_CHECK_RADIO_BTN);
    }

    @And("user confirm terms of service agreement")
    public void userConfirmTermsOfServiceAgreement() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.TERMS_OF_SERVICE_AGREEMENT);
    }

    @And("user click place order button")
    public void userClickPlaceOrderButton() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.PLACE_ORDER_BTN);
    }

    @And("user click continue button in delivery info block")
    public void userClickContinueButtonInDeliveryInfoBlock() {
        Page.at(CheckOutPage.class).clickWhenEnabled(CheckOutPage.CONFIRM_DELIVERY_BTN);
    }
}