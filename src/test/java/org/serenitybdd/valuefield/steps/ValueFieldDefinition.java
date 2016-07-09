package org.serenitybdd.valuefield.steps;

import org.serenitybdd.valuefield.steps.serenity.ValueFieldsSteps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValueFieldDefinition {
	@Steps
	ValueFieldsSteps valueFieldStep;

	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String linkPage) throws Throwable {
		valueFieldStep.openLinkVisit(linkPage);
	}

	@When("^go inside the \"([^\"]*)\" frame$")
	public void go_inside_the_frame(String element) throws Throwable {
		valueFieldStep.switchToFrame(element);
	}

	@Then("^assert that the value of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void assert_that_the_value_of_is(String element, String elementText)
			throws Throwable {
		valueFieldStep.assertValueTextIs(element, elementText);
	}

	@Then("^assert that the value of \"([^\"]*)\" is not \"([^\"]*)\"$")
	public void assert_that_the_value_of_is_not(String element,
			String elementText) throws Throwable {
		valueFieldStep.assertValueTextNot(element, elementText);
	}

	@Then("^assert that the value of \"([^\"]*)\" has \"([^\"]*)\"$")
	public void assert_that_the_value_of_has(String element, String elementText)
			throws Throwable {
		valueFieldStep.assertValueTextHas(element, elementText);
	}

	@Then("^assert that the value of \"([^\"]*)\" does not have \"([^\"]*)\"$")
	public void assert_that_the_value_of_does_not_have(String element,
			String elementText) throws Throwable {
		valueFieldStep.assertValueTextNotHave(element, elementText);
	}
}
