package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class EditprofilePage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_settings")
    MobileElement btnSetting;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_editprofile")
    MobileElement btnEditprofil;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement btnPhoto;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnCapture;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnCeklis;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_dob")
    MobileElement btnDob;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOk;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement btnNewtext;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement txtFullname;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_location")
    MobileElement btnLocation;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/recycler_view']"+
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/txt_city_name')]")
    List<MobileElement> ListLocation;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_phone_number")
    MobileElement txtPhonenumber;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_bio")
    MobileElement txtBio;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_id")
    MobileElement btnBeautyprofile;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinType;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_tones']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded_titled')]")
    List<MobileElement> ListSkinTone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_undertones']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinUnder;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListHairType;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_colors']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListColorHair;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hijabs']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> ListHijab;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_save")
    MobileElement btnSave;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_concern")
    MobileElement btnBeautyconcern;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_skin']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListSkinconcern;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_body']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListBodyconcern;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_hair']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListHairconcern;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_continue")
    MobileElement btnSave2;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_save")
    MobileElement btnDone;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button")
    MobileElement btnBack;

    public EditprofilePage() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    public void tapSettingBtn() {btnSetting.click();}
    public void tapEditprofilBtn() {btnEditprofil.click();}
    public void tapPhotoBtn() {btnPhoto.click();}
    public void tapCaptureBtn() {btnCapture.click();}
    public void tapCeklisBtn() {btnCeklis.click();}
    public void tapDobBtn() {btnDob.click();}
    public void tapOkBtn() {btnOk.click();}
    public void tapNewtextBtn() {btnNewtext.clear();}
    public void inputFullname(String name) {txtFullname.sendKeys(name);}
    public void tapLocationBtn() {btnLocation.click();}
    public void selectLocation(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListLocation.size());
        ListLocation.get(rndInt).click();
    }
    public void tapPhonenumberTxt() {txtPhonenumber.clear();}
    public void inputPhonenumber(String number) {txtPhonenumber.sendKeys(number);}
    public void tapBioTxt() {txtBio.clear();}
    public void inputBio(String bio) {txtBio.sendKeys(bio);}
    public void tapBeautyprofileBtn() {btnBeautyprofile.click();}
    public void selectSkinType() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinType.size());
        ListSkinType.get(rndInt).click();
    }
    public void selectSkinTone() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinTone.size());
        ListSkinTone.get(rndInt).click();
    }
    public void selectSkinUnder() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinUnder.size());
        ListSkinUnder.get(rndInt).click();
    }
    public void selectHairType() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairType.size());
        ListHairType.get(rndInt).click();
    }
    public void selectColorHair() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListColorHair.size());
        ListColorHair.get(rndInt).click();
    }
    public void selectHijab() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHijab.size());
        ListHijab.get(rndInt).click();
    }
    public void tapSaveBtn() {btnSave.click();}
    public void tapBeautyconcernBtn() {btnBeautyconcern.click();}
    public void selectSkinconcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinconcern.size());
        ListSkinconcern.get(rndInt).click();
    }
    public void selectBodyconcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListBodyconcern.size());
        ListBodyconcern.get(rndInt).click();
    }
    public void selectHairconcern() {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairconcern.size());
        ListHairconcern.get(rndInt).click();
    }
    public void tapSave2Btn() {btnSave2.click();}
    public void tapDoneBtn() {btnDone.click();}
    public void tapBackBtn() {btnBack.click();}
}
