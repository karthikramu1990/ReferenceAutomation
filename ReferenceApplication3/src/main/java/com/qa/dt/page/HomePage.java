package com.qa.dt.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.qa.dt.base.BaseClass;
import com.qa.dt.util.ExtentManager;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='session-dropdown']")
	private static WebElement SwitchProjectDd;

	@FindBy(xpath = "//div[@id='logo']")
	private static WebElement invicaraLogo;

	@FindBy(xpath = "//i[@class='inv-icon-svg inv-icon-assets' or @class='inv-icon-svg inv-icon-assets purple active']")
	private static WebElement elementMenu;

	@FindBy(xpath = "//*[text()='Navigator']")
	private static WebElement navigator;
	
	@FindBy(xpath = "//*[text()='Model Elements']")
	private static WebElement modelElements;

	public HomePage selectElementMenu() {

		try {
			moveToElement(elementMenu);
			ExtentManager.test.log(Status.INFO, "2D/3D menu selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select 2D/3D menu");
		}
		return this;

	}

	public HomePage selectModelElementScreen() {

		try {
			elementClick(modelElements);
			moveToElementByOffset(modelElements);
			ExtentManager.test.log(Status.INFO, "Model element menu Selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Model element menu");
		}
		return this;

	}
	
	public HomePage selectNavigatorScreen() {

		try {
			elementClick(navigator);
			moveToElementByOffset(navigator);
			ExtentManager.test.log(Status.INFO, "Navigator menu Selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select navigator menu");
		}
		return this;

	}
	
	

}
