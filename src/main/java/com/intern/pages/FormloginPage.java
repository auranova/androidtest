package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FormloginPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtFieldusername;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtFieldpassword;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signin")
    MobileElement btnLogin;

    public FormloginPage() { PageFactory.initElements(new AppiumFieldDecorator(driver),this); }

    public void prosesLogin(String uname, String password) {
        txtFieldusername.   sendKeys(uname);
        txtFieldpassword.sendKeys(password);
        btnLogin.click();
    }


}
