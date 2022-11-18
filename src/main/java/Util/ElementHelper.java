package Util;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;


    public ElementHelper(WebDriver driver) {
        Duration fromMinutes = Duration.ofSeconds(10);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,fromMinutes);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){           //ELEMANI BEKLİYOR
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key){              //ELEMANIN BULUNMASI
        WebElement element=presenceElement(key);
        return element;
    }

    public void click(By key){                          //BULUNAN ELEMANA CLICK YAPILMASI
        findElement(key).click();
    }

    public void sendKey(By key,String text){
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key){                   // ELEMANIN GÖRÜNÜR OLDUĞUNU KONTROL ETMENİZ
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }



}
