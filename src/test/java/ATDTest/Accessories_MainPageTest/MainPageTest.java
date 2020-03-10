package ATDTest.Accessories_MainPageTest;

import AutoDoc.ATD.Accessories_MainPage.MainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


public class MainPageTest {


    @BeforeClass
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.autodoc.de/autozubehoer");
    }



    @Test
    public void checkTitleMainPageTest() {
        new MainPage().checkTitleMainPage("KFZ ZUBEHÖR ONLINESHOP")
                      .checkSubTitleMainPage("Alles für Ihr Auto aus einer Hand");
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







    @AfterClass
    public void turnDown() {
        close();
    }


}



