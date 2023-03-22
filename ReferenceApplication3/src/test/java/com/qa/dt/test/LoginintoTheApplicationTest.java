package com.qa.dt.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;

import com.qa.dt.base.BaseClass;
import com.qa.dt.page.LoginPage;
import com.qa.dt.page.ProjectSelectionPage;
import com.qa.dt.util.EncryptAndDecrypt;
import com.qa.dt.util.Xls_Reader;




public class LoginintoTheApplicationTest extends BaseClass{
	static Xls_Reader xl = new Xls_Reader();
	static LoginPage lp;
	static Logger logger;
	ProjectSelectionPage psp;
	
	
	
	
	public void browserLaunch() throws IOException, Exception {
		browser_LaunchIgnoreCase(loadProperties().getProperty("Browser"));
		Properties loadProperties = loadProperties();
		System.out.println(loadProperties.getProperty("RfUrl"));
		launchURL(loadProperties.getProperty("RfUrl"));
	}
	@BeforeClass
	public void loginTheApplication() throws Throwable {
		browserLaunch();
		lp= new LoginPage();
		lp.enterUserName(loadProperties().getProperty("Rfusername"));
		lp.enterPassword(loadProperties().getProperty("RfPassword"));
		ProjectSelection();
	}
	
	private void ProjectSelection() throws Throwable {
		
		psp = new ProjectSelectionPage();
		psp.selectProjectFromDd(xl.getCellData("projectSelect","ProjectList",3));
		psp.selectUserGroupFromDd(xl.getCellData("projectSelect","UserGroup",3));
		
	}
	
//	@AfterClass
	//@AfterMethod
	public void tearDown() {
		driverQuit();
	}
	

}
