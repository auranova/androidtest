package com.intern.util;

import com.intern.base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends TestBase {
    public NavigationBar() { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    @AndroidFindBy (xpath = "//android.widget.RelativeLayout[@content-desc='view1']")
    AndroidElement btnTabHome;
    @AndroidFindBy (xpath = "//android.widget.RelativeLayout[@content-desc='view2']")
    AndroidElement btnTabFeed;
    @AndroidFindBy (xpath = "//android.widget.RelativeLayout[@content-desc='view4']")
    AndroidElement btnTabDiscover;
    @AndroidFindBy (xpath = "//android.widget.RelativeLayout[@content-desc='view5']")
    AndroidElement btnTabProfile;
    @AndroidFindBy (xpath = "//android.widget.RelativeLayout[@content-desc='view3']")
    AndroidElement btnTabPlus;

    public void tabBtnNavHome() {btnTabHome.click();}
    public void tabBtnNavFeed() {btnTabFeed.click();}
    public void tabBtnNavDiscover() {btnTabDiscover.click();}
    public void tabBtnNavProfile() {btnTabProfile.click();}
    public void tabBtnNavPlus() {btnTabPlus.click();}
}
