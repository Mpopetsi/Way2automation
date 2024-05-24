package Utils;

import Pages.CustomerPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.way2automation.com/angularjs-protractor/banking/#/login");
    public LoginPage login = PageFactory.initElements(driver, LoginPage.class);

   public CustomerPage customerPage = PageFactory.initElements(driver, CustomerPage.class);
}
