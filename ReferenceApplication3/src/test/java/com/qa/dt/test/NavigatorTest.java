package com.qa.dt.test;

import org.testng.annotations.Test;

import com.qa.dt.base.BaseClass;
import com.qa.dt.page.HomePage;
import com.qa.dt.page.ModelElementPage;
import com.qa.dt.page.NavigatorPage;
import com.qa.dt.util.Xls_Reader;

public class NavigatorTest extends LoginintoTheApplicationTest{
	
	NavigatorPage navigator;
	HomePage hp;
	BaseClass bc;
	static Xls_Reader xl = new Xls_Reader();
	
	//@Test(priority=0)
	public void verifyModelDetails() {
		
		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectNavigatorScreen();
		navigator = new NavigatorPage();
		navigator.clickNavigatorSearch();
		navigator.selectElementCategory(xl.getCellData("ModelElement", 0, 2));
		navigator.selectElementType(xl.getCellData("ModelElement", 1, 2));
		navigator.clickfetchbutton();
		navigator.selectNavigatorGroupBy(xl.getCellData("ModelElement", 2, 2));
		navigator.selectNavigatorProperty(xl.getCellData("ModelElement", 3, 2));
		navigator.selectNavigatorFunction(xl.getCellData("ModelElement", 4, 2));
		navigator.selectNavigatorValue(xl.getCellData("ModelElement", 5, 2));
		navigator.clickNavigatorAddButton();
		navigator.selectNavigatorList();
		navigator.selectNavigatorShowingResult();
		navigator.validateElementProperties();
		navigator.validateTelemetryCollection();
		navigator.validateWarrantyData();
		
	}
	
	//@Test(priority=0)
	public void verifyWarrantyDataDetails() {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectNavigatorScreen();
		navigator = new NavigatorPage();
		navigator.clickNavigatorSearch();
		navigator.selectElementCategory(xl.getCellData("ModelElement", 0, 2));
		navigator.selectElementType(xl.getCellData("ModelElement", 1, 2));	
		navigator.clickfetchbutton();
		navigator.selectNavigatorList();
		navigator.selectNavigatorShowingResult();
		navigator.addNavigatorWarrantyData();
		navigator.editNavigatorWarrantyData();
		navigator.deleteNavigatorWarrantyData();	

	}
	
	@Test(priority=0)
	public void verifyTelemetryCollectionData() throws Exception {

		hp = new HomePage();
		hp.selectElementMenu();
		hp.selectNavigatorScreen();
		navigator = new NavigatorPage();
		navigator.clickNavigatorSearch();
		navigator.selectElementCategory(xl.getCellData("ModelElement", 0, 3));
		navigator.selectElementType(xl.getCellData("ModelElement", 1, 3));	
		navigator.clickfetchbutton();
		navigator.selectNavigatorList();
		navigator.selectNavigatorShowingResult();
		navigator.verifyTelemetryCollection();
		

	}

}
