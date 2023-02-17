package TestGoThroughShopping;

import AutomationStore.Shopping;
import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoThrough {
    @Before
    public void openStoreWebssite() {
        open("https://automationteststore.com/");
    }

    @Test
    public void doShopping() {
        Shopping.searchBar.setValue("cream");
        Shopping.searchBar.pressEnter();
        Shopping.addToCart.click();
        Shopping.proceedToCheckout.click();
        Shopping.guestCheckout.click();
        Shopping.continueAsGuest.click();
        Shopping.enterGuestDetails();
        Shopping.continueCheckout.click();
        Shopping.confirmOrder.click();
        Shopping.checkoutResultText.should(Condition.exactText(" YOUR ORDER HAS BEEN PROCESSED!"));
    }
}