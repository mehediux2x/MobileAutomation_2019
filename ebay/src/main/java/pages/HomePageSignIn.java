package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSignIn extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='Search for anything']")
    WebElement searchBarElements;

    public WebElement getSearchBarElements(){
         return searchBarElements;
    }
    public void searchBar(){
        getSearchBarElements().click();


    }

    @FindBy(xpath = "//android.widget.TextView[@text='DEALS']")
    WebElement DEALSElements;

    public WebElement getDEALSElementsBarElements(){
         return DEALSElements;
    }
    public void deals(){
        sleepFor(20);
        getDEALSElementsBarElements().click();
    }

    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    WebElement signInElements;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    WebElement signInPageCloseElements;

    public WebElement getsignInElements(){
        return signInElements;
    }
    public void signIn(){
        sleepFor(10);
        getsignInElements().click();
        signInPageCloseElements.click();
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    WebElement mainNavigationElements;

    public WebElement getmainNavigationElements(){
        return mainNavigationElements;
    }
    public void mainNavigation(){
        sleepFor(5);
        getmainNavigationElements().click();
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Sign in,double tap to activate\"]\n")
    WebElement signInMainNavigateElements;

    public WebElement getsignInMainNavigateElements(){
        return signInMainNavigateElements;
    }

    public void signInMainNavigate(){
        mainNavigation();
        getsignInMainNavigateElements().click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Today’s Deals – All With Free Shipping']")
    WebElement dealsElements;
    public WebElement getdealsElements(){
        return dealsElements;
    }

    public void mainNavigateDeals(){
        sleepFor(5);
        mainNavigation();
        getdealsElements().click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    WebElement searchBarTypeElements;
    public void searchAndShopping(){
        //searchBar();
        sleepFor(8);
        getSearchBarElements().click();
        sleepFor(6);
        searchBarTypeElements.sendKeys("shoes");
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"eBay\"]")
    WebElement ebayLogoElements;

    public WebElement getebayLogoElements(){
        return ebayLogoElements;
    }

    public void ebayLogo(){
        sleepFor(8);
        getebayLogoElements().isDisplayed();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"shopping cart\"]\n")
    WebElement shoppingCartElements;

    public WebElement getshoppingCartElements(){
        return shoppingCartElements;
    }


    public void shoppingCart(){
        sleepFor(5);
        getshoppingCartElements().click();
        sleepFor(10);
        appiumDriver.navigate().back();
//        sleepFor(7);
//        Assert.assertEquals(ebayLogoElements.isDisplayed(),true);
    }

    @FindBy(xpath = "//android.widget.Button[@text='REGISTER']")
    WebElement registerElements;

    @FindBy(xpath = "//android.widget.Button[@text='CREATE A BUSINESS ACCOUNT']")
    WebElement createBusinessAccountElements;
    public WebElement getRegisterElements(){
        return registerElements;
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]")
    WebElement savedButtonElements;
    public void saveButton(){
        savedButtonElements.click();
        appiumDriver.navigate().back();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText\n")
    WebElement legalBusinessNameElements;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText\n")
    WebElement legalBusinessEmailElements;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='rbusinessemail']" )
    WebElement legalBusinessReEnterEmailElements;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[2]/android.widget.EditText\n" )
    WebElement passwordElements;
    public void register(){
        sleepFor(8);
        getRegisterElements().click();
        createBusinessAccountElements.click();
        sleepFor(15);
        legalBusinessNameElements.sendKeys("Md Mehedi");
        legalBusinessEmailElements.sendKeys("mehedi@yahoo.com");
        sleepFor(2);
        legalBusinessReEnterEmailElements.sendKeys("mehedi@yahoo.com");
        passwordElements.sendKeys("1225bs");

    }









}
