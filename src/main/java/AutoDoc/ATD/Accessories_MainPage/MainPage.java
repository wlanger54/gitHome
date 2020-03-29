package AutoDoc.ATD.Accessories_MainPage;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    private SelenideElement titleMainPage = $(By.xpath("//h1[@class='page-title']"));
    private SelenideElement subTitleMainPage = $(By.xpath("//div[@class='page-subtitle']"));

    private SelenideElement divTop_topProducts = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[1]")),
            divTop_topAccessories = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[2]")),
            divTop_topAutoElectronics = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[3]"));
    private ElementsCollection divTop_4TopProducts = $$(By.xpath("//div[@class='accessories-tabs__item active']//span[@data-gac='TOP_catalog_accessories']"));

    private SelenideElement divTop_4TopProducts_redirectOnListing = $(By.xpath("//div[@class='accessories-tabs__item active']//span[@data-gac='TOP_catalog_accessories'][1]"));

    private SelenideElement titleMainCatalogProducts = $(By.xpath("//h2[@class='accessories-catalog__title']"));





    public MainPage checkTitleMainPage(String expectedText){
      titleMainPage.shouldHave(text(expectedText));
      return this;
    }

    public MainPage checkSubTitleMainPage(String pieceOfText) {
      subTitleMainPage.shouldHave(text(pieceOfText));
      return this;

    }


    public MainPage checkDivTop_topProducts() {
        divTop_topProducts.shouldBe(visible);
        return this;
    }

    public MainPage checkDivTop_topAccessories() {
        divTop_topAccessories.click();
        return this;
    }

    public MainPage checkDivTop_topAutoElectronics() {
        divTop_topAutoElectronics.click();
        return this;
    }

    public MainPage checkDivTop_4TopProducts() {
        divTop_4TopProducts.shouldHave(size(4));
        return this;
    }

    public ListingPage_divTop clickAndRedirectOnListing_DivTop() {
        divTop_4TopProducts_redirectOnListing.click();
        new ListingPage_divTop(). ListingNamePodcategorii.shouldBe(visible);
        return page(ListingPage_divTop.class);
    }

    public MainPage checkTitleMainCatalogProducts(String expectedText) {
        titleMainCatalogProducts.shouldHave(text(expectedText));
        return this;
    }






}
