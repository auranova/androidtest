package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class EditorPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/item_editorchoice")
    MobileElement btnEditor;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
    AndroidElement btnProduk0;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
    AndroidElement btnProduk1;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='2']")
    AndroidElement btnProduk2;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='3']")
    AndroidElement btnProduk3;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='4']")
    AndroidElement btnProduk4;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='5']")
    AndroidElement btnProduk5;
    @AndroidFindBy (id = "com.fdbr.android.debug:id/civ_photo_review")
    MobileElement btnAddreview;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_overall")
    MobileElement rateOverall;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_packaging")
    MobileElement ratePackaging;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_1")
    MobileElement btnPrice1;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_2")
    MobileElement btnPrice2;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_3")
    MobileElement btnPrice3;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_yes")
    MobileElement btnRepurchaseYes;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_maybe")
    MobileElement btnRepurchaseMaybe;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_purchase_no")
    MobileElement btnRepurchaseNo;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_story")
    MobileElement reviewformpage;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnDone;


public EditorPage() { PageFactory.initElements(new AppiumFieldDecorator(driver),this); }

    public void tapEditorBtn() {btnEditor.click();}
    public void tapProduk0Btn() {btnProduk0.click();}
    public void tapProduk1Btn() {btnProduk1.click();}
    public void tapProduk2Btn() {btnProduk2.click();}
    public void tapProduk3Btn() {btnProduk3.click();}
    public void tapProduk4Btn() {btnProduk4.click();}
    public void tapProduk5Btn() {btnProduk5.click();}
    public void tapAddreviewBtn() {btnAddreview.click();}
    public void setOverallRate() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(5) + 1;

        AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
        int startOverallX = rateOverall.getLocation().getX();
        int startOverallY = rateOverall.getLocation().getY();
        int widthOverallX = rateOverall.getSize().getWidth();
        int endOverallX = startOverallX + widthOverallX;
        int tapOverallAt;
        switch (rand_int1) {
            case 1:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.2));
                break;
            case 2:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.4));
                break;
            case 3:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.6));
                break;
            case 4:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.8));
                break;
            case 5:
                tapOverallAt = startOverallX + widthOverallX;
                break;
            default:
                return;
        }
        androidtouchaction.press(PointOption.point(tapOverallAt, startOverallY)).release().perform();
            }
     public void setPackagingRate() {
         Random rand = new Random();
         int rand_int2 = rand.nextInt(5) + 1;

         AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
         int startPackagingX = ratePackaging.getLocation().getX();
         int startPackagingY = ratePackaging.getLocation().getY();
         int widthPackagingX = ratePackaging.getSize().getWidth();
         int endPackagingX = startPackagingX + widthPackagingX;
         int tapPackagingAt;
         switch (rand_int2) {
             case 1:
                 tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.2));
                 break;
             case 2:
                 tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.4));
                 break;
             case 3:
                 tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.6));
                 break;
             case 4:
                 tapPackagingAt = startPackagingX + ((int) (widthPackagingX * 0.8));
                 break;
             case 5:
                 tapPackagingAt = startPackagingX + widthPackagingX;
                 break;
             default:
                 return;
         }
         androidtouchaction.press(PointOption.point(tapPackagingAt, startPackagingY)).release().perform();
     }

    public void setPrice() {
        Random rand = new Random();
        int rand_int3 = rand.nextInt(3) + 1;
        switch (rand_int3) {
            case 1:
                btnPrice1.click();
                break;
            case 2:
                btnPrice2.click();
                break;
            case 3:
                btnPrice3.click();
                break;
            default:
                System.out.println("Wrong price selected");
                break;
        }
    }

    public void setRepurchase() {
        Random rand = new Random();
        int rand_int4 = rand.nextInt(3) + 1;
        switch (rand_int4) {
            case 1:
                btnRepurchaseYes.click();
                break;
            case 2:
                btnRepurchaseMaybe.click();
                break;
            case 3:
                btnRepurchaseNo.click();
                break;
            default:
                System.out.println("Wrong repurchase selected");
                break;
        }
    }

    public void inputReview(String Review) {reviewformpage.sendKeys(Review);}
    public void tapDoneBtn() {btnDone.click();}
}
