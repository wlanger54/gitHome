package ATDTest.Accessories_MainPage;

import AutoDoc.ATD.Accessories_MainPage.MainPage;
import com.codeborne.selenide.Configuration;
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
    public void checkTitleMainPageTest() {
        new MainPage().checkTitleMainPage("AUTO ACCESSOIRES")
                .checkSubTitleMainPage("Autozubehör Artikel von namhaften Marken");
    }


    @Test
    public void checkDivTopProducts() {
        new MainPage().checkDivTop_topProducts()
                .checkDivTop_4TopProducts()
                .checkDivTop_topAccessories()
                .checkDivTop_4TopProducts()
                .checkDivTop_topAutoElectronics()
                .checkDivTop_4TopProducts()
                .clickAndRedirectOnListing_DivTop();

    }


    @Test
    public void checkDivMainCatalogProducts() {
     new MainPage().checkTitleMainCatalogProducts("AUTODOC Kfz Zubehör Katalog");
    }





    @AfterMethod
    public void turnDown() {
        close();
    }

}



