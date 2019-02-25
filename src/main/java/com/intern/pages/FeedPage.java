package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FeedPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_user")
    MobileElement btnUser;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnPost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_like")
    MobileElement btnLike;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_product")
    MobileElement btnItem;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_read_full_review")
    MobileElement btnreview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_like")
    MobileElement btnLikerev;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_review")
    MobileElement btnRevitem;

    public FeedPage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapUserBtn() {btnUser.click();}
    public void tapLikeBtn() {btnLike.click();}
    public void tapItemBtn() {btnItem.click();}
    public void tapPostBtn() {btnPost.click();}
    public void tapReviewBtn() {btnreview.click();}
    public void tapLikerevBtn() {btnLikerev.click();}
    public void tapRevitemBtn() {btnRevitem.click();}
}
