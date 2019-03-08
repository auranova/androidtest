package com.intern.testcases;

import com.github.javafaker.Faker;
import com.intern.base.TestBase;
import com.intern.pages.CarouselPage;
import com.intern.pages.OnboardingPage;
import com.intern.pages.SignUpPage;
import com.intern.util.ScrollDown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRegister extends TestBase {
    private CarouselPage carouselPage;
    private OnboardingPage onboardingPage;
    private SignUpPage signuppage;
    private Faker faker;
    private ScrollDown scrollDown;

    public TestRegister() {super();}

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        onboardingPage = new OnboardingPage();
        carouselPage = new CarouselPage();
        signuppage = new SignUpPage();
        faker = new Faker();
        scrollDown = new ScrollDown();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void tcRegister() {
        carouselPage.tapNextBtn();
        carouselPage.tapNextBtn();
        carouselPage.tapStartBtn();
        onboardingPage.tapBtnSignUp();
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        signuppage.tapRegisterBtn();
        signuppage.tapBirthBtn();
        scrollDown.ScrollDown();
//        signuppage.tapDateBtn();
//        signuppage.tapMonthBtn();
//        signuppage.tapYearBtn();
        signuppage.tapOkBtn();
        signuppage.tapNextBtn();
        signuppage.selectSkinType();
        signuppage.selectSkinTone();
        signuppage.selectSkinUnderTone();
        signuppage.tapNextBtn();
        signuppage.selectHairType();
        signuppage.selectColoredHair();
        signuppage.selectHijab();
        signuppage.tapNextBtn();
        signuppage.selectSkinConcern();
        signuppage.tapNextBtn();
        signuppage.selectBodyConcern();
        signuppage.tapNextBtn();
        signuppage.selectHairConcern();
        signuppage.tapNextBtn();
        signuppage.tapPhotoBtn();
        signuppage.tapCaptureBtn();
        signuppage.tapDoneBtn();
        signuppage.inputFullname(faker.name().fullName());
        signuppage.inputPhonenumber(faker.phoneNumber().phoneNumber());
        signuppage.tapLocationBtn();
        signuppage.selectLocation();
        signuppage.tapNextBtn();
        signuppage.tapSkipBtn();
        signuppage.tapStartBtn();
    }
}
