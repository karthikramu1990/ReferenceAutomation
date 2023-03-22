package com.qa.dt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.qa.dt.base.BaseClass;
import com.qa.dt.util.ExtentManager;
import com.qa.dt.util.Xls_Reader;

public class NavigatorPage extends BaseClass{

	public NavigatorPage() {
		PageFactory.initElements(driver, this);
	}

	static Xls_Reader xl = new Xls_Reader();

	@FindBy(xpath = "//button[text()='Load Project']")
	private static WebElement loadProjectBtn;

	@FindBy(xpath = "//div[@id='logo']")
	private static WebElement invicaraLogo;

	@FindBy(xpath = "(//div[@class='ipa-select__indicators css-1wy0on6'])[1]")
	private static WebElement elementCategory;

	@FindBy(xpath = "(//div[@class='ipa-select__indicators css-1wy0on6'])[2]")
	private static WebElement elementType;

	@FindBy(xpath = "//span[contains(text(),'Fetch')]")
	private static WebElement fetchButton;

	@FindBy(xpath = "//i[@class='fas fa-search']")
	private static WebElement navigatorSearch;

	@FindBy(xpath = "//i[@class='fas fa-filter']")
	private static WebElement navigatorFilter;

	@FindBy(xpath = "//i[@class='fas fa-list']")
	private static WebElement navigatorList;

	@FindBy(xpath = "//i[@class='fas fa-undo']")
	private static WebElement navigatorClearFilters;

	@FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
	private static WebElement navigatorGroupBy;

	@FindBy(xpath = "//div[@class='buttons']")
	private static WebElement navigatorFilterBy;

	@FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[3]")
	private static WebElement navigatorSelectProperty;

	@FindBy(xpath = "//div[contains(text(),'Select Function')]")
	private static WebElement navigatorSelectFunction;

	@FindBy(xpath = "//div[contains(text(),'Select Value')]")
	private static WebElement navigatorSelectValue;	

	@FindBy(xpath = "//span[contains(text(),'Add')]")
	private static WebElement navigatorAdd;

	@FindBy(xpath = "(//div[@class='content-column checkbox'])[1]")
	private static WebElement navigatorShowingResult;

	@FindBy(xpath = "(//span[contains(text(),'Expand panel')])[1]")
	private static WebElement navigatorExpandPanel;

	@FindBy(xpath = "(//div[contains(text(),'Element Properties')])[1]")
	private static WebElement navigatorElementProperties;

	@FindBy(xpath = "(//div[contains(text(),'Telemetry Collection')])[1]")
	private static WebElement navigatorTelemetryCollection;

	@FindBy(xpath = "(//div[contains(text(),'Warranty Data')])[1]")
	private static WebElement navigatorWarrantyData;

	@FindBy(xpath = "(//div[contains(text(),'Element Properties')])[2]")
	private static WebElement navigatorElementPropertiesTable;

	@FindBy(xpath = "(//div[contains(text(),'Telemetry Collection')])[2]")
	private static WebElement navigatorTelemetryCollectionTable;

	@FindBy(xpath = "(//div[contains(text(),'Warranty Data')])[2]")
	private static WebElement navigatorWarrantyDataTable;
	
	@FindBy(xpath = "(//span[contains(text(),'Add')])[2]")
	private static WebElement navigatorWarrantyAdd;
	
	@FindBy(xpath = "//input[@name='description']")
	private static WebElement navigatorWarrantyDescription;
	
	@FindBy(xpath = "//input[@name='startDate']")
	private static WebElement navigatorWarrantyStartDate;
	
	@FindBy(xpath = "//input[@name='duration']")
	private static WebElement navigatorWarrantyDuration;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private static WebElement navigatorWarrantySave;
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private static WebElement navigatorWarrantyEdit;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private static WebElement navigatorWarrantyDelete;
	
	@FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
	private static WebElement navigatorWarrantyDeleteDialog;
	
	@FindBy(xpath = "//span[contains(text(),'Start Reading')]")
	private static WebElement navigatorTelemetryStartReading;
	
	@FindBy(xpath = "//span[contains(text(),'Fetch Reading')]")
	private static WebElement navigatorTelemetryFetchReading;
	
	@FindBy(xpath = "//span[contains(text(),'Stop Reading')]")
	private static WebElement navigatorTelemetryStopReading;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private static WebElement navigatorTelemetryStopReadingDelete;
	
	





	public void clickNavigatorSearch() {

		try {

			actionClickElement(navigatorSearch);

			ExtentManager.test.log(Status.INFO, "Navigator Search button has been clicked in Navigator Page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to click Navigator Search button in Navigator Page");
		}

	}


	public void selectElementCategory(String name) {

		try {
			elementClick(elementCategory);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));

			ExtentManager.test.log(Status.INFO, "Element category has been Selected in Navigator Page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Element category in Navigator Page");
		}

	}

	public void selectElementType(String name) {

		try {

			elementClick(elementType);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));
			elementClick(invicaraLogo);

			ExtentManager.test.log(Status.INFO, "Element type has been Selected in Navigator Page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Element type in Navigator Page");
		}

	}

	public void clickfetchbutton() {

		try {

			elementClick(fetchButton);

			ExtentManager.test.log(Status.INFO, "Fetchbutton has been clicked in Navigator Page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to click Fetchbutton in Navigator Page");
		}

	}

	public void selectNavigatorGroupBy(String name) {

		try {


			elementClick(navigatorGroupBy);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));

			ExtentManager.test.log(Status.INFO, "Group selected in GroupBy dropdown");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Group in GroupBy dropdown");
		}

	}


	public void selectNavigatorProperty(String name) {

		try {

			elementClick(navigatorFilterBy);
			Thread.sleep(2000);
			elementClick(navigatorSelectProperty);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));

			ExtentManager.test.log(Status.INFO, "Property has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select property");
		}

	}

	public void selectNavigatorFunction(String name) {

		try {

			actionClickElement(navigatorSelectFunction);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));

			ExtentManager.test.log(Status.INFO, "Function has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Function");
		}

	}

	public void selectNavigatorValue(String name) {

		try {
			Thread.sleep(2000);
			elementClick(navigatorSelectValue);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));

			ExtentManager.test.log(Status.INFO, "Value has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Value");
		}

	}

	public void clickNavigatorAddButton() {

		try {

			elementClick(navigatorAdd);


			ExtentManager.test.log(Status.INFO, "Add Button clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to click Add button");
		}

	}

	public void selectNavigatorList() {

		try {

			elementClick(navigatorList);



			ExtentManager.test.log(Status.INFO, "Navigator Showing List has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Navigator Showing List");
		}

	}

	public void selectNavigatorShowingResult() {

		try {

			elementClick(navigatorShowingResult);


			ExtentManager.test.log(Status.INFO, "Navigator showing result has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Navigator Showing result");
		}

	}

	public void validateElementProperties() {

		try {			
			elementIsDisplayed(navigatorElementPropertiesTable);
			ExtentManager.test.log(Status.INFO, "Elementproperties Table has been validated");
		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate elementproperties Table");
		}

	}

	public void validateTelemetryCollection() {

		try {			
			elementClick(navigatorTelemetryCollection);
			elementIsDisplayed(navigatorTelemetryCollectionTable);

			ExtentManager.test.log(Status.INFO, "TelemetryCollection Table has been validated");
		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate TelemetryCollection Table");
		}

	}

	public void validateWarrantyData() {

		try {	
			
			elementClick(navigatorWarrantyData);
			elementIsDisplayed(navigatorWarrantyDataTable);
			
			ExtentManager.test.log(Status.INFO, "WarrantyData Table has been validated");
		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate WarrantyData Table");
		}

	}
	
	public void addNavigatorWarrantyData() {

		try {	
			
			elementClick(navigatorWarrantyData);
			elementClick(navigatorWarrantyAdd);
			elementSendkeys(navigatorWarrantyDescription,xl.getCellData("WarrantyDetails", 0, 2));
			elementSendkeys(navigatorWarrantyStartDate,xl.getCellData("WarrantyDetails", 1, 2));
			elementSendkeys(navigatorWarrantyDuration,xl.getCellData("WarrantyDetails", 2, 2));
			elementClick(navigatorWarrantySave); 
			
			ExtentManager.test.log(Status.INFO, "New Warranty Details has been added");
		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to add new warranty data");
		}

	}
	
	public void editNavigatorWarrantyData() {

		try {			
			Thread.sleep(3000);
			elementClick(navigatorWarrantyEdit); 			 
			elementSendkeys(navigatorWarrantyDescription,xl.getCellData("WarrantyDetails", 0, 3));
			elementSendkeys(navigatorWarrantyStartDate,xl.getCellData("WarrantyDetails", 1, 3));
			elementSendkeys(navigatorWarrantyDuration,xl.getCellData("WarrantyDetails", 2, 3));
			elementClick(navigatorWarrantySave); 
			
			ExtentManager.test.log(Status.PASS, "Navigator warranty Details has been Edited successfully");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to Edit navigator warranty details");
		}

	}
	
	public void deleteNavigatorWarrantyData() {

		try {			
			Thread.sleep(2000);
			elementClick(navigatorWarrantyDelete); 	
			elementClick(navigatorWarrantyDeleteDialog);
			
			
			ExtentManager.test.log(Status.PASS, "Navigator warranty Details has been Deleted successfully");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to delete navigator warranty details");
		}

	}
	
	public void verifyTelemetryCollection() throws Exception {

		
		Thread.sleep(3000);		
		elementClick(navigatorTelemetryCollection);			
		elementClick(navigatorTelemetryStopReading);
		elementClick(navigatorTelemetryStopReadingDelete);
		elementClick(navigatorTelemetryStartReading);
		
		try {
			
			elementClick(navigatorTelemetryFetchReading);			
			
			
		logPasswithimage("Telemetry collection Fetch reading", "Fetch Reading for Telemetry collection");
		
	
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		logFailwithimage("Failed to Fetch Reading","Failed to Fetch Reading");
	}
		

		
		
}


}
