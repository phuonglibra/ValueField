package org.serenitybdd.valuefield.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;
import org.serenitybdd.valuefield.pages.ValueFieldPages;

public class ValueFieldsSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ValueFieldPages valueFieldPage;

	@Step
	public void openLinkVisit(String linkPage) {
		valueFieldPage.open();
		valueFieldPage.openAt(linkPage);
		getDriver().manage().window().maximize();
	}

	@Step
	public void switchToFrame(String element) {

		getDriver().switchTo().frame(valueFieldPage.getElement(element));
	}

	@Step
	public void assertValueTextIs(String element, String elementText) {
		Assert.assertEquals(
				valueFieldPage.getElement(element).getAttribute("value"),
				elementText);
	}

	@Step
	public void assertValueTextNot(String element, String elementText) {
		Assert.assertNotEquals(
				valueFieldPage.getElement(element).getAttribute("value"),
				elementText);
	}

	@Step
	public void assertValueTextHas(String element, String elementText) {
		String var = valueFieldPage.getElement(element).getAttribute("value");
		if (var.contains(elementText)) {
			System.out.println("Value has " + elementText);
		} else {
			System.out.println("Value not have ");
		}
		System.out.println(elementText);
	}

	@Step
	public void assertValueTextNotHave(String element, String elementText) {
		String var = valueFieldPage.getElement(element).getAttribute("value");
		if (!var.contains(elementText)) {
			System.out.println("Value has " + elementText);
		} else {
			System.out.println("Value not have ");
		}
		System.out.println(elementText);

	}

}
