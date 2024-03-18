package com.browserstack.UnifiedAppTest;

import com.browserstack.UnifiedAppTest.Pages.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SampleTest extends AbstractBasePage<SampleTest> {
    public SampleTest(WebDriver driver, String deviceId) {
        super(driver, "bstackdemo.json");
        this.get();
    }

    @Override
    protected void isLoaded() throws Error {
        utils.waitUntilPresent(getLocator("add-to-cart-12"));
    }


    public void search(String query) {
        log.info("Add to cart test");
        utils.click(getLocator("add-to-cart-12"));
        utils.click(getLocator("cartBtn"));
        utils.click(getLocator("checkout-btn"));
        utils.click(getLocator("username-input"));
        utils.click(getLocator("userNameVal"));
        utils.click(getLocator("password-input"));
        utils.click(getLocator("pwdVal"));
        utils.click(getLocator("login-btn"));
        //utils.waitUntilPresent(getLocator("search_page_load"));
        utils.captureScreenshot("sample");
        utils.scroll(ScrollDirection.UP, 5);
    }
}
