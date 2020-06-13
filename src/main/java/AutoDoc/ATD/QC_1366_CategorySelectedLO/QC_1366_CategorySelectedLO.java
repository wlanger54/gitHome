package AutoDoc.ATD.QC_1366_CategorySelectedLO;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;





public class QC_1366_CategorySelectedLO {

    SelenideElement secondGroupMainCatalog() {
        return $x("//div[@class='accessories-catalog']//div[@class='accessories-catalog__row'][1]/div[@class='accessories-catalog__group'][2]");
    }

    ElementsCollection blockCategoriesInLogicalUnion() {
        return $$x("//div[@class='accessories-catalog__categories' and @style='display: block;']");
    }



// Methods
    @Step("Get name all categories after hover.")
    public QC_1366_CategorySelectedLO hoverLo() {
        secondGroupMainCatalog().hover();
       return this;
    }

    public ArrayList<String> getListCategories() {
        ArrayList<String> listCategories = new ArrayList<>();
        for (SelenideElement categories:blockCategoriesInLogicalUnion()) {
            String name = categories.$x("//div[@class='accessories-catalog__categories' and @style='display: block;']/ul/li/a//span").getText();
            listCategories.add(name);
            System.out.println(name);
        }

        return listCategories;
    }


}









