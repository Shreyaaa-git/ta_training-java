package com.epam.training.student_shreya_chakraborty.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteValidationPage {
    private WebDriver driver;

    @FindBy(xpath = "//textarea[@class='textarea']")
    private WebElement pasteCodeField;

    @FindBy(xpath = "//div[@class='left']//a[contains(text(), 'Bash')]")
    private WebElement syntaxHighlighting;

    public PasteValidationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPasteCode() {
        return pasteCodeField.getText();
    }

    public String getSyntaxHighlighting() {
        return syntaxHighlighting.getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
