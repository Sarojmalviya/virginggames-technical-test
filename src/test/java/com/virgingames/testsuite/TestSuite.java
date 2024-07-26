package com.virgingames.testsuite;

import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void test1(){
        homePage.clickOnLoginLink();
    }

}
