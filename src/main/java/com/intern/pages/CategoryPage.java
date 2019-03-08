package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/item_category")
    MobileElement btnCategory;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wardah']")
    AndroidElement btnProduk;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/civ_photo_review")
    MobileElement btnAddReview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_overall")
    MobileElement btnRateOveral;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_packaging")
    MobileElement btnRatePack;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_1")
    MobileElement btnPrice1;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_2")
    MobileElement btnPrice2;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_3")
    MobileElement btnPrice3;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_yes")
    MobileElement btnYes;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_maybe")
    MobileElement btnMaybe;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_no")
    MobileElement btnNo;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_story")
    MobileElement txtReview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnDone;

    public CategoryPage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapCategoryBtn() {btnCategory.click();}
    public void tapProdukBtn() {btnProduk.click();}
    public void tapAddReview() {btnAddReview.click();}
    public void tapRateOverallBtn() {btnRateOveral.click();}
    public void tapRatePackBtn() {btnRatePack.click();}
    public void tapPrice1Btn() {btnPrice1.click();}
    public void tapPrice2Btn() {btnPrice2.click();}
    public void tapPrice3Btn() {btnPrice3.click();}
    public void tapYesBtn() {btnYes.click();}
    public void tapMaybeBtn() {btnMaybe.click();}
    public void tapNoBtn() {btnNo.click();}
    public void inputReview(String Review) {txtReview.sendKeys(Review);}
    public void tapDoneBtn() {btnDone.click();}
}
