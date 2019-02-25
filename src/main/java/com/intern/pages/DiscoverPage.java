package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DiscoverPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnPostdisco;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement btnBackd;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_user")
    MobileElement btnUser;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnPost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_like")
    MobileElement btnLike;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_comment")
    MobileElement txtComment;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_post")
    MobileElement btnPostcomment;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_comment")
    MobileElement btnComment;

public DiscoverPage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapPostdiscoBtn() {btnPostdisco.click();}
    public void tapBackdBtn() {btnBackd.click();}
    public void tapUserBtn() {btnUser.click();}
    public void tapPostBtn() {btnPost.click();}
    public void tapLikeBtn() {btnLike.click();}
    public void prosescoment(String comment) {
        txtComment.sendKeys(comment);
    }
    public void tapPostcommentBtn() {btnPostcomment.click();}
    public void tapCommentBtn() {btnComment.click();}
}
