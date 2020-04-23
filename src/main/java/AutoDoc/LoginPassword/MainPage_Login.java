package AutoDoc.LoginPassword;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage_Login {


   private SelenideElement loginButton = $x("//header[@class='header  ']//a[@class='js-show-login-popup header-i header-i--user']"),
           inputEmail = $x("//input[@id='login_top_email']"),
           inputPassword = $x("//input[@name='Password']"),
           buttonLogin = $x("//a[@class='enter submit']"),
           errorText = $x("//div[@id='popup_update']//ul/li");



   public MainPage_Login LoginPasswordPopup() {
      loginButton.click();
      return this;
   }

   public MainPage_Login enterEmail(String emailAdress) {
      inputEmail.setValue(emailAdress);
      return this;
   }

   public MainPage_Login enterPassword(String password) {
      inputPassword.setValue(password);
      return this;
   }

   public MainPage_Login clickButton() {
      buttonLogin.click();
      sleep(3000);
      return this;
   }

   public MainPage_Login loginToSite(String email, String password){
      enterEmail(email);
      enterPassword(password);
      clickButton();
      return this;

   }

   public MainPage_Login getErrorText(String expectedText){
       errorText.shouldHave(text(expectedText));
       return this;

   }







   }


