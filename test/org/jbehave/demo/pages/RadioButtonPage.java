package org.jbehave.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RadioButtonPage {
    private static final String url = "http://www.echoecho.com/htmlforms10.htm";
//    private static final By radioButtonLocator = By.xpath("/html/body/div[3]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[1]");
    private static final By radioButtonLocator = By.cssSelector("body > div:nth-child(3) > table:nth-child(14) > tbody > tr > td.main > table > tbody > tr > td > div > span > form > table:nth-child(2) > tbody > tr > td > table > tbody > tr:nth-child(2) > td.table8 > input[type=\"radio\"]:nth-child(3)");
// http://saucelabs.com/resources/selenium/css-selectors


    WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void go() {
        driver.get(url);
    }

    public void clickRadioButton() {
        WebElement radioButton = radioButtonLocator.findElement(driver);
        radioButton.click();
    }


}
