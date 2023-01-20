package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private final WebDriver driver;
    private final By emailField = By.name("auth_email");
    private final By passwordField = By.name("auth_pass");
    private final By submitButton = By.className("form_auth_button");


    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public boolean isValidationMessageAppear(){
        return !driver.findElement(emailField).getAttribute("validationMessage").isEmpty();
    }
}
