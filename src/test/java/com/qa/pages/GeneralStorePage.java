package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GeneralStorePage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement usernameTxtFld;

    @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
    private WebElement femaleOption;

    @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
    private WebElement maleOption;

    @AndroidFindBy(id="android:id/text1")
    private WebElement selectCounrtyButton;

    @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement shopButton;

    public GeneralStorePage(){
    }

    public void setCountrySelection(String countryName) throws InterruptedException {
        Thread.sleep(5000);
        selectCounrtyButton.click();
        scrollToElement(countryName);
        selectDropDownValueBasedOnText("//android.widget.TextView", countryName);
    }
    public void enterUserNameStore(String username) throws InterruptedException {
        Thread.sleep(1000);
        clear(usernameTxtFld);
        sendKeys(usernameTxtFld, username, "login with " + username);
    }

    public void setGender(String gender) {
        if (gender.contains("female")) {
            femaleOption.click();
        }
        else {
            maleOption.click();
        }
    }

    public void setShopButton(){

        shopButton.click();
    }
}
