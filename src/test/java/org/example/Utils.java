package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.nio.file.Files;
import java.time.Duration;

public class Utils {

    public static WebElement waitForElement(ChromeDriver driver, By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public static void takeScreenshot(ChromeDriver driver, String fileName) {
        try {
            // Capture screenshot
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Destination folder + filename
            File dest = new File("C:\\Users\\USER\\IdeaProjects\\RWTeam\\" + fileName + ".png");


            // Copy screenshot
            Files.copy(src.toPath(), dest.toPath());

            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}
