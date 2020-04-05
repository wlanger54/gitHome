package AutoDoc.ATD.Accessories_MainPage_QASYS_440;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ListingPage_categoryMainCatalog {



    private SelenideElement titleListingCategory_MainCatalog = $(By.xpath("//h2[@class='title_count_search']"));

    public SelenideElement getTitleListingCategory_MainCatalog() {
        return titleListingCategory_MainCatalog;
    }

}

