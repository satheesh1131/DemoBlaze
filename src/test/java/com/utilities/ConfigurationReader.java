package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	File f;
	FileInputStream fis;
	Properties prop;
	public ConfigurationReader() throws IOException {
		f = new File("C:\\eclipse workspace\\DemoBlaze\\src\\test\\java\\com\\utilities\\Expected.properties");
		fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}
	public String getBrowser1() {
		return prop.getProperty("browser1");
	}
	public String getBrowser2() {
		return prop.getProperty("browser2");
	}
	public String getUrl() {
		return prop.getProperty("url");
	}

}
