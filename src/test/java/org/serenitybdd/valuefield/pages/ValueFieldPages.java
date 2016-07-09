package org.serenitybdd.valuefield.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://google.com")
public class ValueFieldPages extends PageObject {

	public WebElement getElement(String element) {

		return getDriver().findElement(getObject(element));
	}

	private By getObject(String element) {
		By by = null;
		try {
			if (element.startsWith("id=")) {
				element = element.substring(3);
				by = By.id(element);
			}
			if (element.startsWith("name=")) {
				element = element.substring(5);
				by = By.name(element);
			}
			return by;
		} catch (Exception e) {
			System.out.println("Canot find element: " + element);
		}
		return null;
	}

}
