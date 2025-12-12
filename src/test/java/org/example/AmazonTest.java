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
                By.xpath("//div[@class=\"s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1\"]"),
                15
        );
        firstResult.click();

        WebElement addToCart = Utils.waitForElement(driver,
                By.xpath("//a[text()=\" Add to List \"]"),
                15);

        Assert.assertTrue(addToCart.isDisplayed(), "Add to Cart button NOT visible!");

        System.out.println(" Product page loaded successfully!");

        // 5. Take screenshot
        Utils.takeScreenshot(driver, "Amazon_Product_Page");
    }





    @AfterClass
    public void end() {
        tearDown();
    }
}
