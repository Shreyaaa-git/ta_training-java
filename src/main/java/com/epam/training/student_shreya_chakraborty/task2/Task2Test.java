package com.epam.training.student_shreya_chakraborty.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validatePaste() {
        driver.get("https://pastebin.com/");

        // Create paste (reuse logic from Task 1 if needed)
        // ...

        // Validate paste
        PasteValidationPage validationPage = new PasteValidationPage(driver);

        assertEquals("how to gain dominance among developers", validationPage.getPageTitle());
        assertEquals("Bash", validationPage.getSyntaxHighlighting());
        assertEquals("Expected paste code", validationPage.getPasteCode());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
