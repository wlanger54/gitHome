package AutoDoc.ATD.Accessories_MainPage_QASYS_440;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ListingPage_divTop {


    private SelenideElement listingNameCategory = $(By.xpath("//h2[@class='title_count_search']"));


    public SelenideElement getListingNameSubcategory() {
        return listingNameCategory;
    }


}
