package testCases;

import common.MobileAPI;
import org.junit.Ignore;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageSignIn;

public class TestEbay extends MobileAPI {


    HomePageSignIn homePageSignIn;
    @BeforeMethod
    public void initElements(){
        homePageSignIn= PageFactory.initElements(appiumDriver,HomePageSignIn.class);
    }

    @Test(enabled = false)
    public void searchBarTest(){
        sleepFor(20);
        homePageSignIn.searchBar();
        appiumDriver.navigate().back();
    }
    @Test(enabled = false)
    public void dealsTest(){
        homePageSignIn.deals();
        sleepFor(10);
    }


    @Test(enabled = false)
    public void signInTest(){
        homePageSignIn.signIn();
    }

    @Test(enabled = false)
    public void testMainNavigation(){
        homePageSignIn.mainNavigation();
    }
    @Test(enabled = false)
    public void testsignInMainNavigate(){
        homePageSignIn.signInMainNavigate();
    }
    @Test(enabled = false)
    public void testmainNavigateDeals(){
        homePageSignIn.mainNavigateDeals();
    }

    @Test(enabled = false)
    public void testsearchAndShopping(){
        homePageSignIn.searchAndShopping();
    }
    @Test(enabled = false)
    public void testebayLogo(){
        homePageSignIn.ebayLogo();
    }

    @Test(enabled = false)
    public void testshoppingCart(){
        homePageSignIn.shoppingCart();
    }
    @Test(enabled = false)
    public void testsaveButton(){
        homePageSignIn.saveButton();
    }

    @Test(enabled = true)
    public void testregister(){
        homePageSignIn.register();
    }









}
