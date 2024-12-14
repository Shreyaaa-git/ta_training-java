package com.epam.training.student_shreya_chakraborty.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinHomePage {
    private WebDriver driver;

    @FindBy(id = "postform-text")
    private WebElement pasteCodeField;

    @FindBy(id = "select2-postform-expiration-container")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//li[contains(text(), '10 Minutes')]")
    private WebElement expirationOption;

    @FindBy(id = "postform-name")
    private WebElement pasteNameField;

    @FindBy(xpath = "//button[contains(text(), 'Create New Paste')]")
    private WebElement createPasteButton;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCode(String code) {
        pasteCodeField.sendKeys(code);
    }

    public void selectExpiration() {
        expirationDropdown.click();
        expirationOption.click();
    }

    public void enterPasteName(String name) {
        pasteNameField.sendKeys(name);
    }

    public void clickCreatePaste() {
        createPasteButton.click();
    }
}
