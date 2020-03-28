package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.SignPage;

public class StepImplementation extends BaseTest {

    SignPage signPage;

    @Step({"Siteye Giriş"})
    public void before() {
        signPage = new SignPage(getWebDriver());
    }
    @Step("Popup kapat")
    public void implementation2() {
       signPage.popupClose();
   }

    @Step({"Giriş Yapın üstüne gelir"})
    public void hoverElement() {
        signPage.hoverElement();
    }

    @Step({"Giriş Yap"})
    public void loginClick() {
        signPage.loginClick();
    }

    @Step({"Email <email> girin"})
    public void emailEnter(String email) {
        signPage.Emailenter(email);
    }

    @Step({"Şifre  <password> girin"})
    public void passwordEnter(String password) {
        signPage.PasswordEnter(password);
    }

    @Step({"Giriş yap tuşuna basılır"})
    public void clickLogin() {
        signPage.clickLogin();
    }

    @Step("trenyol.com açılır")
    public void implementation1() {

    }
}