package com.relisource.Project.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relisource.Project.Utils.DriverManager;
import com.relisource.Project.Utils.UrlTextUtils;
import com.relisource.Project.Utils.XpathUtils;

public class ProjectTest {

	private WebDriver driver = null;

	@Test
	public void RelisourceTest() {
		driver = DriverManager.driver;

		driver.get(UrlTextUtils.Url.Base_URL);

		// Start Executing driver.findElement(By.xpath(XpathUtils.SelectBtn)).click();
		driver.findElement(By.xpath(XpathUtils.searchstudyfield)).sendKeys(UrlTextUtils.Text.textselect);
		Select element = new Select(driver.findElement(By.xpath(XpathUtils.searchstudyfield)));
		element.selectByVisibleText(UrlTextUtils.Text.textselect);

	}
}
