package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_close" )
    MobileElement btnX;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement btnBack;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fab")
    MobileElement btnPlus;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_post_photo")
    MobileElement btnAddpost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOk;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnIzin;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img")
    MobileElement btnArtikel;


    public HomePage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapXBtn() {btnX.click();}
    public void tapBackBtn() {btnBack.click();}
    public void tapPlusBtn() {btnPlus.click();}
    public void tapAddpostBtn() {btnAddpost.click();}
    public void tapOkBtn() {btnOk.click();}
    public void tapIzinBtn() {btnIzin.click();}
    public void tapArtikelBtn() {btnArtikel.click();}

}
