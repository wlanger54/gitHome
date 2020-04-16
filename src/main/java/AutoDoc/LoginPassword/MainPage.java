package AutoDoc.LoginPassword;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage {


   private SelenideElement loginButton = $x("//header[@class='header  ']//a[@class='js-show-login-popup header-i header-i--user']"),
           inputEmail = $x("//input[@id='login_top_email']"),
           inputPassword = $x("//input[@name='Password']"),
           buttonLogin = $x("//a[@class='enter submit']"),
           errorText = $x("//div[@class='txt ']//li");



   public MainPage LoginPasswordPopup() {
      loginButton.click();
      return this;
   }

   public MainPage enterEmail(String emailAdress) {
      inputEmail.setValue(emailAdress);
      return this;
   }

   public MainPage enterPassword(String password) {
      inputPassword.setValue(password);
      return this;
   }

   public MainPage clickButton() {
      buttonLogin.click();
      sleep(3000);
      return this;
   }

   public MainPage loginToSite(String emailAdress, String password){
      enterEmail(emailAdress);
      enterPassword(password);
      clickButton();
      return this;

   }

   public MainPage getErrorText(String expectedText){
       errorText.shouldHave(text(expectedText));
       return this;

   }







   }


