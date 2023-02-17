package TestNoResults;

import AutomationStore.Shopping;
import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestNoResults {

    @Before
    public void openStoreWebsite() {
        open("https://automationteststore.com/");
    }

    @Test
    public void searchHasMultipleResults() {
        Shopping.searchBar.setValue("cream");
        Shopping.searchBar.pressEnter();
        Shopping.sortByList.shouldBe(Condition.visible);
    }
}