package ATDTest.Accessories_MainPage;

import AutoDoc.ATD.Accessories_MainPage_QASYS_440.MainPage;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


public class MainPageTest {



    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.auto-doc.at/autozubehoer");
    }

    @Test
    @Owner(value = "Sergey-QA")
    public void checkTitleMainPageTest() {
        new MainPage().checkTitleMainPage("AUTO ACCESSOIRES")
                .checkSubTitleMainPage("Autozubehör Artikel von namhaften Marken");
    }


    @Test
    public void checkDivTopCategories() {
        new MainPage().checkDivTop_topCategories()
                .checkDivTop_4TopCategories()
                .checkDivTop_topAccessories()
                .checkDivTop_4TopCategories()
                .checkDivTop_topAutoElectronics()
                .checkDivTop_4TopCategories()
                .clickAndRedirectOnListing_DivTop();
    }


    @Test
    public void checkDivMainCatalogProducts() {
     new MainPage().checkTitleMainCatalogProducts("AUTODOC Kfz Zubehör Katalog")
             .checkHoverLO_MainCatalog()
             .clickAndRedirectOnListingChild_MainCatalog();
    }


    @Test
    public void checkDivTopProducts(){
        new MainPage().visibleDivTopProducts()
                .countTheNumberOfCards(6)
                .checkHoverDetailsCard_DivTopProduct("Details");

    }





    @AfterMethod
    public void turnDown() {
        close();
    }

}



