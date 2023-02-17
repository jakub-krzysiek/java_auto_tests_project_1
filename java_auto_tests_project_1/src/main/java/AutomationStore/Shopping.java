package AutomationStore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Shopping {
    public static final SelenideElement searchBar = $("#filter_keyword");
    public static final SelenideElement emptySearchResult = $("#maincontainer > div > div > div > div > div:nth-child(4)");
    public static final SelenideElement searchHeader = $("#maincontainer > div > div > div > h1");
    public static final SelenideElement sortByList = $("#maincontainer > div > div > div > div > div:nth-child(4) > form");
    public static final SelenideElement addToCart = $("#maincontainer > div > div > div > div > div.thumbnails.grid.row.list-inline > div:nth-child(1) > div.thumbnail > div.pricetag.jumbotron > a > i");
    public static final SelenideElement cartButton = $("#maincontainer > div > div > div > div > div.thumbnails.grid.row.list-inline > div:nth-child(1) > div.thumbnail > div.pricetag.jumbotron > a > i");
    public static final SelenideElement proceedToCheckout = $("body > div > header > div.container-fluid > div > div.block_7 > ul > li > ul > li > div.row > div:nth-child(2) > a > i");
    public static final SelenideElement guestCheckout = $("#accountFrm > fieldset > div:nth-child(2) > label");
    public static final SelenideElement continueAsGuest = $("#accountFrm > fieldset > button");
    public static final SelenideElement firstNameInput = $("#guestFrm_firstname");
    public static final SelenideElement lastNameInput = $("#guestFrm_lastname");
    public static final SelenideElement emailInput = $("#guestFrm_email");
    public static final SelenideElement addressFirstLineInput = $("#guestFrm_address_1");
    public static final SelenideElement cityInput = $("#guestFrm_city");
    public static final SelenideElement regionOrState = $("#guestFrm_zone_id");
    public static final SelenideElement postalCode = $("#guestFrm_postcode");
    public static final SelenideElement countryList = $("#guestFrm_country_id");
    public static final SelenideElement continueCheckout = $("#guestFrm > div.form-group > div > button");
    public static final SelenideElement confirmOrder = $("#checkout_btn");
    public static final SelenideElement checkoutResultText = $("#maincontainer > div > div > div > h1 > span.maintext");

    public static void enterGuestDetails() {
        firstNameInput.setValue("Abc");
        lastNameInput.setValue("Xyz");
        emailInput.setValue("123@123.com");
        addressFirstLineInput.setValue("1 Abc Lane, XYZ");
        cityInput.setValue("Qwerty");
        regionOrState.selectOption(5);
        regionOrState.pressEnter();
        postalCode.setValue("123456");
        countryList.selectOption("Finland");
    }
}
