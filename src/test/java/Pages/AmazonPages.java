package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {

    //static WebDriver driver;

    static ElementHelper elementHelper;

    WebDriverWait wait;

    static By accept=By.id("sp-cc-accept");
    static By search=By.id("twotabsearchtextbox");
    static By searchButton=By.id("nav-search-submit-button");
    static By amazonFilter=By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']");
    static By appleFilter=By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(12) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By firstProduct= By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By add = By.id("add-to-cart-button");
    static By back = By.id("attach-close_sideSheet-link");
    static By cart=By.cssSelector("div[id='nav-cart-text-container'] span[class='nav-line-1']");
    static By check=By.cssSelector(".a-truncate-cut");








    public AmazonPages(WebDriver driver){
        //this.driver=driver;
        //this.wait=new WebDriverWait(driver);
        this.elementHelper=new ElementHelper(driver);

    }

    public static void HomePage() {//zaten url var
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
       elementHelper.sendKey(search,"airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(back);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
