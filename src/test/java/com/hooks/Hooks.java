package com.hooks;

import java.io.IOException;

import com.resources.BaseClass;
import com.utilities.FileReaderManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before("@demoBlaze")
	public void browserSetup() throws IOException {
		BaseClass.openBrowser(FileReaderManager.getInstance().getCrInstance().getBrowser1());
		BaseClass.implicityWait();
	}
	@BeforeStep
	public void stepScreenshot(Scenario s) {
		s.attach(BaseClass.screenShot(), "image/png", s.getName());
	}
	@After
	public void scenarioScreenshot(Scenario s) {
		if(s.isFailed()) {
			s.attach(BaseClass.screenShot(), "image/png", s.getName());
		}
	}
	@After("@order or @login or @signup")
	public void tearDown() {
		BaseClass.closeBrowser();
	}
}
