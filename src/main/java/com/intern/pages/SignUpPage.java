package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SignUpPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_email")
    MobileElement txtEmail;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtUsername;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtPassword;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_fullname")
    MobileElement txtFullname;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_phone_number")
    MobileElement txtPhonenumber;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_register")
    MobileElement btnRegister;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_dob")
    MobileElement btnBirth;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='02']")
    AndroidElement btnDate;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Feb']")
    AndroidElement btnMonth;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2006']")
    AndroidElement btnYear;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOk;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_next")
    MobileElement btnNext;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_photo")
    MobileElement btnPhoto;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnCapture;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnDone;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_btn")
    MobileElement btnStart;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_skip_button")
    MobileElement btnSkip;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_location")
    MobileElement btnLocation;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/recycler_view']"+
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/txt_city_name')]")
    List<MobileElement> ListLocation;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinTypes;
    @AndroidFindBy(xpath = "//android.widget.ImageView[starts-with(@resource-id,'com.fdbr.android.debug:id/civ_checked_rounded_titled')]")
    List<MobileElement> ListSkinTone;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_undertones']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinUnderTone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id,'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListHairType;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_colors']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id,'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListColoredHair;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hijabs']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id,'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListHijab;

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/rv_skin_concerns']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> ListSkinConcern;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/rv_body_concerns']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> ListBodyConcern;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/rv_hair_concerns']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> ListHairConcern;

    public SignUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void inputEmail(String email) {txtEmail.sendKeys(email);}
    public void inputUsername(String username) {txtUsername.sendKeys(username);}
    public void inputPassword(String password) {txtPassword.sendKeys(password);}
    public void inputFullname(String fullname) {txtFullname.sendKeys(fullname); }
    public void inputPhonenumber(String number) {txtPhonenumber.sendKeys(number);}
    public void tapRegisterBtn() {btnRegister.click();}
    public void tapBirthBtn() {btnBirth.click();}
    public void tapDateBtn() {btnDate.click();}
    public void tapMonthBtn() {btnMonth.click();}
    public void tapYearBtn() {btnYear.click();}
    public void tapOkBtn() {btnOk.click();}
    public void tapNextBtn() {btnNext.click();}
    public void tapPhotoBtn() {btnPhoto.click();}
    public void tapCaptureBtn() {btnCapture.click();}
    public void tapDoneBtn() {btnDone.click();}
    public void tapStartBtn() {btnStart.click();}
    public void tapSkipBtn() {btnSkip.click();}
    public void tapLocationBtn() {btnLocation.click();}
    public void selectLocation(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListLocation.size());
        ListLocation.get(rndInt).click();
    }
    public void selectSkinType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinTypes.size());
        ListSkinTypes.get(rndInt).click();
    }
    public void selectSkinTone(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinTone.size());
        ListSkinTone.get(rndInt).click();
    }
    public void selectSkinUnderTone(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinUnderTone.size());
        ListSkinUnderTone.get(rndInt).click();
    }
    public void selectHairType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairType.size());
        ListHairType.get(rndInt).click();
    }
    public void selectColoredHair(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListColoredHair.size());
        ListColoredHair.get(rndInt).click();
    }
    public void selectHijab() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHijab.size());
        ListHijab.get(rndInt).click();
    }
    public void selectSkinConcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinConcern.size());
        ListSkinConcern.get(rndInt).click();
    }
    public void selectBodyConcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListBodyConcern.size());
        ListBodyConcern.get(rndInt).click();
    }
    public void selectHairConcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairConcern.size());
        ListHairConcern.get(rndInt).click();
    }
}
