package com.epam.training.student.shreya_chakraborty.task1;

import com.epam.training.student_shreya_chakraborty.task1.PastebinHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1Test {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void createNewPaste() {
        driver.get("https://pastebin.com/");

        PastebinHomePage homePage = new PastebinHomePage(driver);
        homePage.enterCode("Hello from WebDriver");
        homePage.selectExpiration();
        homePage.enterPasteName("helloweb");
        homePage.clickCreatePaste();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
