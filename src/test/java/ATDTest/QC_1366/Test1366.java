package ATDTest.QC_1366;

import AutoDoc.ATD.QC_1366_CategorySelectedLO.QC_1366_CategorySelectedLO;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Test1366 {

    private QC_1366_CategorySelectedLO qc_1366_categorySelectedLO = new QC_1366_CategorySelectedLO();

    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.autodoc.de/autozubehoer");
    }


    @Test
    public void checkCategoriesInSidebar(){
        new QC_1366_CategorySelectedLO().hoverLo();
        qc_1366_categorySelectedLO.getListCategories();


    }


    @AfterMethod
    public void turnDown() {
        close();
    }
}
