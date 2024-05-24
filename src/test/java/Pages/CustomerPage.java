package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CustomerPage {
    public WebDriver driver;
    WebElement yourNameText;
    WebElement customerDropDown;

//    WebElement yourName_xpath;
//
//    @FindBy(xpath = "//select[contains(@name,'userSelect')]")
//    WebElement customerDropDown_xpath;

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
