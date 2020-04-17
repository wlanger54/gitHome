package ATDTest.TestLoginPassword;

import AutoDoc.LoginPassword.MainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class TestLogin {






    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.auto-doc.at");
    }


    @Test
    public void checkLoginAndPassword(){
        new MainPage().LoginPasswordPopup()
                .loginToSite("Wlanger54", "00000")
                .getErrorText("Das Feld E-mail muss eine gültige E-Mail-Adresse enthalten.");
   }


   // DataProvider

    @DataProvider(name = "data-provider")
    public Object[][] myfirstDataProvider(){
        return new Object[][] { {"FieldEmail", "FieldPassword"}, {"Anisimov", "Anisimov2"}, {"wlanger", "wlanger54"}  };
    }

    @Test (dataProvider = "data-provider")
    public void myDataProvider(String emailAdress, String password) {
        new MainPage().LoginPasswordPopup()
                .loginToSite(emailAdress, password)
                .getErrorText("Das Feld E-mail muss eine gültige E-Mail-Adresse enthalten.");

    }



    @AfterMethod
    public void turnDown() {
        close();
    }


}
