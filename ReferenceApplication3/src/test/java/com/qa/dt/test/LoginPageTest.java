package com.qa.dt.test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.dt.base.BaseClass;
import com.qa.dt.page.LoginPage;
import com.qa.dt.page.ProjectSelectionPage;
import com.qa.dt.util.EncryptAndDecrypt;


public class LoginPageTest extends BaseClass{
	
	
	private LoginPage lp;
	ProjectSelectionPage pp;
	
	@BeforeMethod
	public void browserLaunch() throws IOException, Exception {
		browser_LaunchIgnoreCase(loadProperties().getProperty("Browser"));
		Properties loadProperties = loadProperties();
		System.out.println(loadProperties.getProperty("RfUrl"));
		launchURL(loadProperties.getProperty("RfUrl"));
	}

//	@AfterClass
//	public void tearDown() {
//		driverQuit();
//	}
	
	@Test
	private void loginTest() throws IOException, Exception {
		lp= new LoginPage();
		lp.enterUserName(loadProperties().getProperty("Rfusername"));
		pp = lp.enterPassword(EncryptAndDecrypt.passwordEncryptAndDecrypt());
		pp.verifyProjectSelectionText();

	}
	
	
}
