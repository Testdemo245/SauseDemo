package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        @FindBy(id="user-name")
        WebElement UserId;
        @FindBy(id="password")
        WebElement Password;
        @FindBy(id="login-button")
        WebElement loginBtn;

        public void LoginApplication(String uname, String password){
            UserId.sendKeys(uname);
            Password.sendKeys(password);


        }
        public void loginbutton(){
            loginBtn.click();


        }


    }

