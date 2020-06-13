package AutoDoc.ATD.QC_1366_CategorySelectedLO;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;





public class ListingCategory {

    SelenideElement titleNameCategory() {
        return $x("//h2[@class='title_count_search']");
    }

    ElementsCollection allCategoriesInSidebar() {
        return $$x("//div[@class='block categories blue topSubCats']/ul/li");
    }





// Methods


}
