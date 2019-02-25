package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NotifPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_notification_button")
    MobileElement btnNotif;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_username_mask")
    MobileElement btnUser;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_user")
    MobileElement btnUsercomment;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnPost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_comment")
    MobileElement btnComent;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_comment")
    MobileElement txtfieldComent;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_post")
    MobileElement btnPostcoment;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_like")
    MobileElement btnLike;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_picture")
    MobileElement btnPostnotif;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='putwid2186']")
    AndroidElement btnTabUser;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button")
    MobileElement btnBack;

    public NotifPage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void prosescoment(String comment) {
        txtfieldComent.sendKeys(comment);
    }
    public void tapPostcomentBtn() {btnPostcoment.click();}
    public void tapNotifBtn() {btnNotif.click();}
    public void tapUserBtn() {btnUser.click();}
    public void tapUsercommentBtn() {btnUsercomment.click();}
    public void tapPostBtn() {btnPost.click();}
    public void tapComentBtn() {btnComent.click();}
    public void tapLikeBtn() {btnLike.click();}
    public void tapPostnotifBtn() {btnPostnotif.click();}
    public void tabBtnNavUser() {btnTabUser.click();}
    public void tapBackBtn() {btnBack.click();}
}
