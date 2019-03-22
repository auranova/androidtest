package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

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
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/rv_notifications']"+
            "//android.widget.RelativeLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_photo')]")
    List<MobileElement> SelectUser;
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
    public void tapSelectUser() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SelectUser.size());
        SelectUser.get(rndInt).click();
    }
    public void tapBackBtn() {btnBack.click();}
}
