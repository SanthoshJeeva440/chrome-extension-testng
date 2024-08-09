package org.calibraint.utils;

import org.calibraint.browser.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;


public class SeleniumUtils extends Browser {
    public static Robot robot;
    public static Actions action;
    public static Select select;
    public static JavascriptExecutor js;
    public static WebDriverWait wait;

    public static void inputText(WebElement locator, String text) {
        locator.sendKeys(text);
    }

    public static void clickElement(WebElement locator) {
        locator.click();
    }

    public static void deleteCookie(Cookie cookie) {
        driver.manage().deleteCookie(cookie);
    }

    public static void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    public static void addCookie(String key, String value) {
        driver.manage().addCookie(new Cookie(key, value));
    }

    public static void clearText(WebElement locator) {
        locator.clear();
    }

    public static void doubleClickElement(WebElement locator) {
        action = new Actions(driver);
        action.doubleClick(locator).perform();
    }

    public static void dragAndDrop(WebElement source, WebElement destination) {
        action = new Actions(driver);
        action.dragAndDrop(source, destination).perform();
    }

    public static void mouseOver(WebElement locator){
        action = new Actions(driver);
        action.moveToElement(locator).perform();
    }

    public static void mouseClickAndHold(WebElement locator){
        action = new Actions(driver);
        action.clickAndHold(locator).perform();
    }

    public static void scrollIntoView(WebElement locator){
        js.executeScript("arguments[0].scrollIntoView();",locator);
    }

    public static void pageDown(){
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public static void pageUp(){
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public static String getText(WebElement locator){
        String text =locator.getText();
        return text;
    }

    public static String getValue(WebElement locator, String attribute){
        String value = locator.getAttribute(attribute);
        return value;
    }

    public static String getTitle(){
        String title = driver.getTitle();
        return title;
    }

    public static void pressKey(String keys){
        String enterKey="KeyEvent"+keys;
        robot.keyPress(Integer.parseInt(enterKey));
    }

    public static void selectFrame(WebElement locator){
        driver.switchTo().frame(locator);
    }

    public static void selectFrameByIndex(int index){
        driver.switchTo().frame(index);
    }

    public static void unSelectFrame(){
        driver.switchTo().defaultContent();
    }

    public static void selectByVisibleText(WebElement locator, String text){
        select = new Select(driver.findElement((By) locator));
        select.selectByVisibleText(text);
    }

    public static void switchWindow(int position){
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[position]);
    }

    public static void selectFromListByIndex(WebElement locator, int index){
        select = new Select(locator);
        select.selectByIndex(index);
    }

    public static void selectFromListByLabel(WebElement locator, String value){
        select = new Select(locator);
        select.selectByValue(value);
    }

    public static String elementAttributeValueShouldBe(WebElement locator, String attribute, String expected) {
        String valueInfo = locator.getAttribute(attribute);
        if (valueInfo == expected) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public static void waitUntilElementIsVisible(WebElement locator, long time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void elementShouldContainText(WebElement locator, String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(locator, text));
    }


    public static void elementShouldBeVisible(WebElement locator) {
        locator.isDisplayed();
    }
}
