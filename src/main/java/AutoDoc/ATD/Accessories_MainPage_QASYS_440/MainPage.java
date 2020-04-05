package AutoDoc.ATD.Accessories_MainPage_QASYS_440;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    private SelenideElement titleMainPage = $(By.xpath("//h1[@class='page-title']"));
    private SelenideElement subTitleMainPage = $(By.xpath("//div[@class='page-subtitle']"));

    private SelenideElement divTopCategories_topProducts = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[1]")),
            divTopCategories_topAccessories = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[2]")),
            divTopCategories_topAutoElectronics = $(By.xpath("//ul[@class='accessories-tabs__nav']/li[3]"));
    private ElementsCollection divTopCategories_4TopProducts = $$(By.xpath("//div[@class='accessories-tabs__item active']//span[@data-gac='TOP_catalog_accessories']"));

    private SelenideElement divTopCategories_4TopProducts_redirectOnListing = $(By.xpath("//div[@class='accessories-tabs__item active']//span[@data-gac='TOP_catalog_accessories'][1]"));

    private SelenideElement titleMainCatalogProducts = $(By.xpath("//h2[@class='accessories-catalog__title']")),
            hoverLO_MainCatalog = $x("//div[@class='accessories-catalog__row'][1]//div[@class='accessories-catalog__group'][1]"),
            categoryLO_MainCatalog = $x("//div[@data-cat-id='307'][2]//li[1]//a");

    private ElementsCollection divTopProducts_CardProducts = $$x("//div[@class='top-product-block']//div[@class='product-list__item active']");
    private SelenideElement divTopProduct_OneCard = $x("//div[@class='top-product-block']//li[1]//div[@class='product-list__item active']"),
            detailsPopup_CardTopProduct = $x("//div[@class='top-product-block']//li[1]//div[@class='product-list__item active']//span[text()='Details']");





// Тайтл

    public MainPage checkTitleMainPage(String expectedText){
      titleMainPage.shouldHave(text(expectedText));
      return this;
    }

    public MainPage checkSubTitleMainPage(String pieceOfText) {
      subTitleMainPage.shouldHave(text(pieceOfText));
      return this;

    }


// Блок топ категорий.    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public MainPage checkDivTop_topCategories() {
        divTopCategories_topProducts.shouldBe(visible);
        return this;
    }

    public MainPage checkDivTop_topAccessories() {
        divTopCategories_topAccessories.click();
        return this;
    }

    public MainPage checkDivTop_topAutoElectronics() {
        divTopCategories_topAutoElectronics.click();
        return this;
    }

    public MainPage checkDivTop_4TopCategories() {
        divTopCategories_4TopProducts.shouldHave(size(4));
        return this;
    }

    public ListingPage_divTop clickAndRedirectOnListing_DivTop() {
        divTopCategories_4TopProducts_redirectOnListing.click();
        new ListingPage_divTop(). getListingNameSubcategory().shouldBe(visible);
        return page(ListingPage_divTop.class);
    }


// Главный каталог

    public MainPage checkTitleMainCatalogProducts(String expectedText) {
        titleMainCatalogProducts.shouldHave(text(expectedText)).scrollTo();
        return this;
    }

    public MainPage checkHoverLO_MainCatalog() {
        actions().moveToElement(hoverLO_MainCatalog).build().perform();
        return this;
    }

    public ListingPage_categoryMainCatalog clickAndRedirectOnListingChild_MainCatalog(){
        categoryLO_MainCatalog.click();
        new ListingPage_categoryMainCatalog().getTitleListingCategory_MainCatalog().shouldBe(visible);
        return page(ListingPage_categoryMainCatalog.class);
    }


// Блок Топ продуктов

    public MainPage countTheNumberOfCards(int expectedSize){
        divTopProducts_CardProducts.shouldHave(size(expectedSize));
        return this ;
    }

    public MainPage checkHoverCard_DivTopProduct(){
        actions().moveToElement(divTopProduct_OneCard).build().perform();
        detailsPopup_CardTopProduct.shouldBe(visible);
        return this;
    }






}
