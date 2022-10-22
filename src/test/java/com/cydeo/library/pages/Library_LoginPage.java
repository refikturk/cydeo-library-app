package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_LoginPage {

    public Library_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.=\"Sign in\"]")
    public WebElement signInButton;

    public void logIn(){
        this.inputEmail.sendKeys();
        this.inputPassword.sendKeys();
        this.signInButton.click();
    }

    public void logIn(String userMail, String password){
        inputEmail.sendKeys(userMail);
        inputPassword.sendKeys(password);
        signInButton.click();
    }







}
