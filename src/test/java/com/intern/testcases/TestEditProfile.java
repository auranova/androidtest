package com.intern.testcases;

import com.github.javafaker.Faker;
import com.intern.base.TestBase;
import com.intern.pages.*;
import com.intern.util.NavigationBar;
import com.intern.util.ScrollDown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestEditProfile extends TestBase {
    private CarouselPage carouselPage;
    private OnboardingPage onboardingPage;
    private FormloginPage formloginPage;
    private HomePage homePage;
    private NavigationBar navigationBar;
    private EditprofilePage editprofilePage;
    private ScrollDown scrollDown;
    private Faker faker;

    public TestEditProfile() {super();}

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        carouselPage = new CarouselPage();
        onboardingPage = new OnboardingPage();
        formloginPage = new FormloginPage();
        homePage = new HomePage();
        navigationBar = new NavigationBar();
        editprofilePage = new EditprofilePage();
        scrollDown = new ScrollDown();
        faker = new Faker();
    }

    @AfterMethod
    public void teardown() {driver.quit();}

    @Test
    public void tcEditprofile() throws InterruptedException {
        carouselPage.tapNextBtn();
        carouselPage.tapNextBtn();
        carouselPage.tapStartBtn();
        onboardingPage.tapLoginBtn();
        formloginPage.prosesLogin(prop.getProperty("username"), prop.getProperty("password"));
        homePage.tapXBtn();
        navigationBar.tabBtnNavProfile();
        editprofilePage.tapSettingBtn();
        editprofilePage.tapEditprofilBtn();
        editprofilePage.tapPhotoBtn();
        editprofilePage.tapCaptureBtn();
        editprofilePage.tapCeklisBtn();
        editprofilePage.tapDobBtn();
        scrollDown.ScrollDown();
        editprofilePage.tapOkBtn();
        editprofilePage.tapNewtextBtn();
        editprofilePage.inputFullname(faker.name().fullName());
        scrollDown.ScrollDown();
        editprofilePage.tapLocationBtn();
        editprofilePage.selectLocation();
        editprofilePage.tapPhonenumberTxt();
        editprofilePage.inputPhonenumber(faker.number().digits(12));
        editprofilePage.tapBioTxt();
        editprofilePage.inputBio(faker.address().fullAddress());
        scrollDown.ScrollDown();
        editprofilePage.tapBeautyprofileBtn();
        editprofilePage.selectSkinType();
        editprofilePage.selectSkinTone();
        editprofilePage.selectSkinUnder();
        scrollDown.ScrollDown();
        editprofilePage.selectHairType();
        editprofilePage.selectColorHair();
        scrollDown.ScrollDown();
        editprofilePage.selectHijab();
        editprofilePage.tapSaveBtn();
        editprofilePage.tapBeautyconcernBtn();
        editprofilePage.selectSkinconcern();
        scrollDown.ScrollDown();
        editprofilePage.selectBodyconcern();
        scrollDown.ScrollDown();
        editprofilePage.selectHairconcern();
        editprofilePage.tapSave2Btn();
        editprofilePage.tapDoneBtn();
        editprofilePage.tapBackBtn();
        Thread.sleep(5);
    }
}
