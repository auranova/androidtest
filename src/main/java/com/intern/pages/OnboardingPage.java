package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OnboardingPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_login")
    MobileElement btnLogin;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signup")
    MobileElement btnSignUp;

    public OnboardingPage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapLoginBtn() {btnLogin.click();}
    public void tapBtnSignUp() {btnSignUp.click();}
}
