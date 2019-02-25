package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_beauty_points")
    MobileElement btnBpoint;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_info_1")
    MobileElement btnWhat;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_info_1")
    MobileElement btnHow;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_low_res")
    MobileElement btnPost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_menu")
    MobileElement btnOption;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_delete")
    MobileElement btnDelete;
    @AndroidFindBy(id = "android:id/button1")
    MobileElement btnYes;

    public ProfilePage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapBpointBtn() {btnBpoint.click();}
    public void tapWhatBtn() {btnWhat.click();}
    public void tapHowBtn() {btnHow.click();}
    public void tapPostBtn() {btnPost.click();}
    public void tapOption() {btnOption.click();}
    public void tapDelete() {btnDelete.click();}
    public void tapYes() {btnYes.click();}
}
