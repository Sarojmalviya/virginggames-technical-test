package com.virgingames.pages;

import com.virgingames.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Login");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
}
