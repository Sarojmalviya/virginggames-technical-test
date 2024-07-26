package com.virgingames.utilities;

import com.virgingames.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends ManageBrowser {
    WebDriverWait wait;
    //This method will click on element
    public void clickOnElement(By by){
        WebElement loginlink = driver.findElement(by);
        loginlink.click();
    }
}
