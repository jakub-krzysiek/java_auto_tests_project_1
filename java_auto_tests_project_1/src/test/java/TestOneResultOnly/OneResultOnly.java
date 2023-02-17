package TestOneResultOnly;

import AutomationStore.Shopping;
import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class OneResultOnly {

    @Before
    public void openStoreWebsite() {
        open("https://automationteststore.com/");
    }

    @Test
    public void searchHasOnlyOneResult() {
        Shopping.searchBar.setValue("gel");
        Shopping.searchBar.pressEnter();
        Shopping.searchHeader.shouldNotBe(Condition.visible);
    }
}
