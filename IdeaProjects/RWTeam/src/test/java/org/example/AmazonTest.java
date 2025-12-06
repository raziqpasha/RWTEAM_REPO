package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class AmazonTest extends BaseTest {

    @BeforeClass
    public void start() {
        setup();
    }

    @Test
    public void amazonProductFlow() throws Exception {

        driver.get("https://www.amazon.com");

        WebElement searchBox = Utils.waitForElement(driver, By.id("twotabsearchtextbox"), 10);
        searchBox.sendKeys("laptop");
        searchBox.submit();

        WebElement firstResult = Utils.waitForElement(
                driver,
                By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]"),
                15
        );
        firstResult.click();

        try {
            WebElement addToCartBtn = Utils.waitForElement(driver,
                    By.id("add-to-cart-button"), 10);
            addToCartBtn.click();
        } catch (Exception e) {
            System.out.println("Trying iframe add-to-cart…");

            driver.switchTo().frame("turbo-checkout-iframe");

            WebElement addToCartBtn = Utils.waitForElement(driver,
                    By.id("add-to-cart-button"), 10);
            addToCartBtn.click();

            driver.switchTo().defaultContent();
        }

        // Step 5: Screenshot
        Utils.takeScreenshot(driver, "ProductPage");

        System.out.println("Test Passed!");
    }

    @AfterClass
    public void end() {
        tearDown();
    }
}
