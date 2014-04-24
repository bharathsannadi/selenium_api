package org.jbehave.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectPage {
    private static final String url = "http://www.tutorialspoint.com/html/html_select_tag.htm";
    private static final By selectLocator = By.xpath("/html/body/center/table/tbody/tr/td[2]/table[2]/tbody/tr/td/table[2]/tbody/tr/td/form/select");
 //   private static final By selectLocator = By.cssSelector("body > center > table > tbody > tr > td:nth-child(2) > table.middle > tbody > tr > td > table:nth-child(17) > tbody > tr > td > form > select");

    WebDriver driver;

    public SelectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void go() {
        driver.get(url);
    }

    public void selectSecondElement() {
        Select select = new Select(selectLocator.findElement(driver));
        select.selectByIndex(1);
    }
}
