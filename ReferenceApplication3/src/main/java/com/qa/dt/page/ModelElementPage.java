package com.qa.dt.page;

import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;
import com.qa.dt.base.BaseClass;
import com.qa.dt.util.ExtentManager;
import com.qa.dt.util.Xls_Reader;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import freemarker.core.ReturnInstruction.Return;

public class ModelElementPage extends BaseClass {

	public ModelElementPage() {
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

	@FindBy(xpath = "//div[@class='content-column  first']")
	private static WebElement showingModel;

	@FindBy(xpath = "//label[contains(text(),'Element Properties')]/..//input[@type='checkbox']")
	private static WebElement elementProperties;

	@FindBy(xpath = "//label[contains(text(),'Files')]/..//input[@type='checkbox']")
	private static WebElement files;

	@FindBy(xpath = "//label[contains(text(),'Warranty Data')]/..//input[@type='checkbox']")
	private static WebElement warrantyData;

	@FindBy(xpath = "//label[contains(text(),'Telemetry Collection')]/..//input[@type='checkbox']")
	private static WebElement telemetryCollection;

	@FindBy(xpath = "//h1[contains(text(),'Element Properties')]")
	private static WebElement elementPropertiesTable;

	@FindBy(xpath = "//h1[contains(text(),'Files')]")
	private static WebElement filesTable;

	@FindBy(xpath = "//h1[contains(text(),'Warranty Data')]")
	private static WebElement warrantyDataTable;

	@FindBy(xpath = "//h1[contains(text(),'Telemetry Collection')]")
	private static WebElement telemetryCollectionTable;
	
	@FindBy(xpath = "//i[@class='icofont-upload-alt']")
	private static WebElement fileUploadButton;
	
	@FindBy(xpath = "//i[@title='Delete']")
	private static WebElement fileDeleteButton;
	
	@FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
	private static WebElement dialogDelete;
	
	@FindBy(xpath = "(//span[contains(text(),'Add')])[2]")
	private static WebElement warrantyAdd;
	
	@FindBy(xpath = "//input[@name='description']")
	private static WebElement warrantyDescription;
	
	@FindBy(xpath = "//input[@name='startDate']")
	private static WebElement warrantyStartDate;
	
	@FindBy(xpath = "//input[@name='duration']")
	private static WebElement warrantyDuration;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private static WebElement warrantySave;
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private static WebElement warrantyEdit;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private static WebElement warrantyDelete;
	
	@FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
	private static WebElement warrantyDeleteDialog;
	
	@FindBy(xpath = "//i[@class='fas fa-sitemap']")
	private static WebElement modelElementExpandButton;
	
	@FindBy(xpath = "//span[contains(text(),'Start Reading')]")
	private static WebElement telemetryStartReading;
	
	@FindBy(xpath = "//span[contains(text(),'Fetch Reading')]")
	private static WebElement telemetryFetchReading;
	
	@FindBy(xpath = "//span[contains(text(),'Stop Reading')]")
	private static WebElement telemetryStopReading;
	
	@FindBy(xpath = "//span[contains(text(),'Stop Reading')]")
	private static WebElement telemetryStopReadingDelete;
	
	//span[contains(text(),'Delete')]
	
	
	
	


	// Methods for Modelelement test file...........................

	public void selectElementcategory(String name) {

		try {

			elementClick(elementCategory);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));
			
			ExtentManager.test.log(Status.INFO, "Element category has been Selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Element category");
		}

	}

	public void selectElementtype(String name) {

		try {
			
			elementClick(elementType);
			elementClick(driver.findElement(By.xpath("//div[contains(text(),'" + name + "')]")));
			elementClick(invicaraLogo);
			
			ExtentManager.test.log(Status.INFO, "Element type has been Selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select Element type");
		}

	}

	

	public void clickfetchbutton() {

		try {

			elementClick(fetchButton);

			ExtentManager.test.log(Status.INFO, "Fetchbutton has been clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to click Fetchbutton");
		}

	}

	public void selectshowingmodel() {

		try {

			elementClick(showingModel);

			ExtentManager.test.log(Status.INFO, "Showingelement has been selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to select showingelement");
		}

	}

	public void validateelementproperties() {

		try {

			if (elementIsSelected(elementProperties)&& (elementIsSelected(files))){
				elementClick(files);
				elementIsDisplayed(elementPropertiesTable);
				ExtentManager.test.log(Status.INFO, "Elementproperties Table has been validated");
			} 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate elementproperties Table");
		}

	}

	public void validatefiles() {

		try {

			if (elementIsSelected(elementProperties)) {
				elementClick(elementProperties);
				elementClick(files);
				elementIsDisplayed(filesTable);
				ExtentManager.test.log(Status.PASS, "Files Table has been validated");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate Files Table");
		}

	}
		
	
	public void validatewarrantydata() {

		try {

			if (elementIsSelected(files)) {
				elementClick(files);
				elementClick(warrantyData);
				elementIsDisplayed(warrantyDataTable);
				ExtentManager.test.log(Status.PASS, "Warrantydata table has been validated");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate Warrantydata table");
		}

	}
	
	public void validatetelemetrycollection() {

		try {

			if (elementIsSelected(warrantyData)) {
				elementClick(warrantyData);
				elementClick(telemetryCollection);
				elementIsDisplayed(telemetryCollectionTable);
				ExtentManager.test.log(Status.PASS, "telemetrycollection table has been validated");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to validate telemetrycollection table");
		}

	}
	
	public void uploadfile() {

		try {
			elementClick(elementProperties);
			elementClick(fileUploadButton); 
			fileUpload("C:\\Users\\KarthikRamu\\eclipse-workspace\\ReferenceApplication2\\files\\sample.pdf");		
			ExtentManager.test.log(Status.PASS, "File has been uploaded");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to upload file");
		}

	}
	
	public void deleteFile() {

		try {
			
			Thread.sleep(5000);
			elementClick(fileDeleteButton); 
			elementClick(dialogDelete); 
			
			
			ExtentManager.test.log(Status.PASS, "File has been deleted");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to delete the file");
		}

	}
	
	public void addWarrantyData() {

		try {			
			Thread.sleep(3000);
			elementClick(elementProperties); 
			elementClick(files); 
			elementClick(warrantyData); 
			elementClick(warrantyAdd); 
			elementSendkeys(warrantyDescription,xl.getCellData("WarrantyDetails", 0, 2));
			elementSendkeys(warrantyStartDate,xl.getCellData("WarrantyDetails", 1, 2));
			elementSendkeys(warrantyDuration,xl.getCellData("WarrantyDetails", 2, 2));
			elementClick(warrantySave); 
			
			ExtentManager.test.log(Status.PASS, "New Warranty Details has been added");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to add New warranty details");
		}

	}
	
	public void editWarrantyData() {

		try {			
			Thread.sleep(3000);
			elementClick(warrantyEdit); 			 
			elementSendkeys(warrantyDescription,xl.getCellData("WarrantyDetails", 0, 3));
			elementSendkeys(warrantyStartDate,xl.getCellData("WarrantyDetails", 1, 3));
			elementSendkeys(warrantyDuration,xl.getCellData("WarrantyDetails", 2, 3));
			elementClick(warrantySave); 
			
			ExtentManager.test.log(Status.PASS, "Warranty Details has been Edited successfully");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to Edit warranty details");
		}

	}
	
	public void deleteWarrantyData() {

		try {			
			Thread.sleep(2000);
			elementClick(warrantyDelete); 	
			elementClick(warrantyDeleteDialog);
			
			
			ExtentManager.test.log(Status.PASS, "Warranty Details has been Deleted successfully");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ExtentManager.test.log(Status.ERROR, "Unable to delete warranty details");
		}

	}
	
	public void verifyTelemetryCollection() throws Exception {

					
			Thread.sleep(3000);
			elementClick(elementProperties); 
			elementClick(files);
			elementClick(telemetryCollection);
			elementClick(modelElementExpandButton);
			elementClick(telemetryStartReading);
			
			try {
				
				elementClick(telemetryFetchReading);
				
				
			logPasswithimage("Telemetry collection Fetch reading", "Fetch Reading for Telemetry collection");
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logFailwithimage("Failed to Fetch Reading","Failed to Fetch Reading");
		}
			Thread.sleep(2000);
			elementClick(telemetryStopReading);
			elementClick(telemetryStopReadingDelete);
	
			
			
	}
	
}
