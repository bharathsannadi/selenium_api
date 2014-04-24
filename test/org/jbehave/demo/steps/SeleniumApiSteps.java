package org.jbehave.demo.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.demo.pages.RadioButtonPage;
import org.jbehave.demo.pages.SelectPage;

public class SeleniumApiSteps {

    private SelectPage selectPage;
    private RadioButtonPage radioButtonPage;

    public SeleniumApiSteps(SelectPage selectPage, RadioButtonPage radioButtonPage) {
        this.selectPage = selectPage;
        this.radioButtonPage = radioButtonPage;
    }


    @When("I visit a radio button site")
    public void visitRadioButtonSite() {
        radioButtonPage.go();
    }

    @Then("I can click a radio button")
    public void clickRadioButton() {
        radioButtonPage.clickRadioButton();
    }

    @When("I visit a site with a dropdown")
    public void visitSelectSite() {
        selectPage.go();
    }

    @Then("I can select an option")
    public void selectOption() {
        selectPage.selectSecondElement();
    }


}
