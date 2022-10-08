package br.ce.rafael.core;

import static br.ce.rafael.core.DriverFactory.getDriver;
import static br.ce.rafael.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.bank.pages.IndexPage;

public class BaseTest {
	private IndexPage page = new IndexPage();
		
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void start(){
		page.acessindexpage();
		
	}
	
	@After
	public void finish() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
