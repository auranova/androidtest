package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Addpost extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_post_photo")
    MobileElement btnAddpost;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnTakephoto;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnCeklis;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/action_done")
    MobileElement btnCeklistag;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_right1")
    MobileElement btnOk;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_right2")
    MobileElement btnOk2;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_tag_product")
    MobileElement btnTag;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/checkbox")
    MobileElement btnCekbox;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_caption")
    MobileElement txtfieldcapt;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_caption")
    MobileElement btnCapt;

    public Addpost() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void prosescapt(String capt) {txtfieldcapt.sendKeys(capt);}
    public void tapCaptBtn() {btnCapt.click();}
    public void tapAddpostBtn() {btnAddpost.click();}
    public void tapTakephotoBtn() {btnTakephoto.click();}
    public void tapCeklisBtn() {btnCeklis.click();}
    public void tapCeklistagBtn() {btnCeklistag.click();}
    public void tapOkBtn() {btnOk.click();}
    public void tapOK2Btn() {btnOk2.click();}
    public void tapTagBtn() {btnTag.click();}
    public void tapCekbocBtn() {btnCekbox.click();}
}
