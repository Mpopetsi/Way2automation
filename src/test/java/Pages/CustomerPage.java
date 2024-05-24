package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CustomerPage {
    WebDriver driver;

    @FindBy(xpath = "//label[contains(.,'Your Name :')]")
    WebElement yourNameText;

    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement customerDropDown;

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void initialize()
    {
        WebElement form = driver.findElement(By.className("form-group"));
        yourNameText = form.findElement(By.tagName("label"));
        customerDropDown = form.findElement(By.id("userSelect"));
    }
    public void verifyYourNameText()
    {
        String results = yourNameText.getText();
        Assert.assertEquals(results, "Your Name :");
    }
    public void clickCustomerDropDown()
    {
        customerDropDown.click();
    }
}
