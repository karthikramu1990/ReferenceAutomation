package com.qa.dt.test;

import java.util.List;

import org.testng.annotations.Test;

import com.qa.dt.base.BaseClass;
import com.qa.dt.page.HomePage;
import com.qa.dt.page.ModelElementPage;
import com.qa.dt.util.Xls_Reader;

public class ModelElementTest extends LoginintoTheApplicationTest {

	ModelElementPage model;
	HomePage hp;
	BaseClass bc;
	static Xls_Reader xl = new Xls_Reader();

	//@Test(priority = 0)
	public void verifyModelDetails() {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectModelElementScreen();
		model = new ModelElementPage();
		model.selectElementcategory(xl.getCellData("ModelElement", 0, 2));
		model.selectElementtype(xl.getCellData("ModelElement", 1, 2));		
		model.clickfetchbutton();
		model.selectshowingmodel();
		model.validateelementproperties();
		model.validatefiles();
		model.validatewarrantydata();
		model.validatetelemetrycollection();


	}
	//@Test(priority = 0)
	public void uploadDeleteFiles() {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectModelElementScreen();
		model = new ModelElementPage();
		model.selectElementcategory(xl.getCellData("ModelElement", 0, 2));
		model.selectElementtype(xl.getCellData("ModelElement", 1, 2));	
		model.clickfetchbutton();
		model.selectshowingmodel();
		model.uploadfile();
		model.deleteFile();		

	}

	//@Test(priority = 0)
	public void verifyWarrantyDataDetails() {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectModelElementScreen();
		model = new ModelElementPage();
		model.selectElementcategory(xl.getCellData("ModelElement", 0, 2));
		model.selectElementtype(xl.getCellData("ModelElement", 1, 2));	
		model.clickfetchbutton();
		model.selectshowingmodel();
		model.addWarrantyData();
		model.editWarrantyData();
		model.deleteWarrantyData();	

	}


	@Test(priority = 0)
	public void verifyTelemetryCollectionData() throws Exception {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectModelElementScreen();
		model = new ModelElementPage();
		model.selectElementcategory(xl.getCellData("ModelElement", 0, 3));
		model.selectElementtype(xl.getCellData("ModelElement", 1, 3));	
		model.clickfetchbutton();
		model.selectshowingmodel();
		model.verifyTelemetryCollection();
		

	}
	
	



}
