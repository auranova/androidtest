package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Addproduk extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_add_product")
    MobileElement btnAddproduk;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement btnPhoto;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnCapture;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnCeklis;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_brand")
    MobileElement btnBrandname;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/tv_title')]")
    List<MobileElement> SelectBrand;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_product_cat")
    MobileElement btnCategory;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_title")
    MobileElement btnSkincare;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_container")
    MobileElement btnMask;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_container")
    MobileElement btnMasksheet;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_name")
    MobileElement btnProductName;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_shade")
    MobileElement btnShade;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_desc")
    MobileElement btnDesc;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_price")
    MobileElement btnPrice;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_add_product")
    MobileElement btnAdd;

    public Addproduk() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapAddprodukBtn() {btnAddproduk.click();}
    public void tapPhotoBtn() {btnPhoto.click();}
    public void tapCaptureBtn() {btnCapture.click();}
    public void tapCeklisBtn() {btnCeklis.click();}
    public void tapBrandnameBtn() {btnBrandname.click();}
    public void tapSelectBrand(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SelectBrand.size());
        SelectBrand.get(rndInt).click();
    }
    public void tapCategoryBtn() {btnCategory.click();}
    public void tapSkincareBtn() {btnSkincare.click();}
    public void tapMaskBtn() {btnMask.click();}
    public void tapMasksheetBtn() {btnMasksheet.click();}
    public void tapProductNameBtn() {btnProductName.click(); }
    public void inputProductName(String name) {btnProductName.sendKeys(name);}
    public void tapShadeBtn() {btnShade.click();}
    public void inputShade(String name) {btnShade.sendKeys(name);}
    public void tapDescBtn() {btnDesc.click();}
    public void inputDesc(String description) {btnDesc.sendKeys(description);}
    public void inputPrice(String number) {btnPrice.sendKeys(number);}
    public void tapAddBtn() {btnAdd.click();}
}
