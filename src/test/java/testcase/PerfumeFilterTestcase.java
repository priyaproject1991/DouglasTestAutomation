package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.ReadXLSdata;

public class PerfumeFilterTestcase extends BaseTest {

	/*Scenario: 
	 * Step1: Open the Url
	 * Step 2: Accept the cookies
	 * Step 3: click on perfume tab
	 * Step 4: apply filters for the perfume selection
	 * 
	 * 
	 */
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "sitdata")
	public static void parfum(String Highlights, String Merk, String Eigenschap, String Fur_wen) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath(locators.getProperty("cookie_accept_btn"))).click();
		WebElement Perfume = driver.findElement(By.xpath(locators.getProperty("parfum_option")));
		Perfume.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement next = driver.findElement(By.xpath(locators.getProperty("next_opt")));
		next.click();

		PerfumeFilterTestcase.Highlightsdropdown(Highlights);
		PerfumeFilterTestcase.merkdropdown(Merk);
		PerfumeFilterTestcase.voorwiedropdown(Fur_wen);
		PerfumeFilterTestcase.Eigenschapdropdown(Eigenschap);

	}

	private static void Highlightsdropdown(String Highlights) {
		
		driver.findElement(By.xpath(locators.getProperty("Highlightsdd"))).click();

		if (Highlights.equalsIgnoreCase("sales")) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath(locators.getProperty("Highlight_sale"))).click();

		} else if (Highlights.toLowerCase() == "cadeau") {
			
			driver.findElement(By.xpath(locators.getProperty("Highlight_cadeau"))).click();
		}

		else if (Highlights.toLowerCase() == "nieuw") {
			
			driver.findElement(By.xpath(locators.getProperty("Highlight_Nieuw"))).click();
		}

		else if (Highlights.toLowerCase() == "limited") {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath(locators.getProperty("Highlight_limited"))).click();
		}

		else if (Highlights.toLowerCase() == "aanbieding") {
			
			driver.findElement(By.xpath(locators.getProperty("Highlights_aanbieding"))).click();
		}

		else if (Highlights.toLowerCase() == "exclusive bij douglas") {
			
			driver.findElement(By.xpath(locators.getProperty("Highlights_exclusief_bij_douglas"))).click();
		}
	}

	private static void merkdropdown(String Merk) {
		
		driver.findElement(By.xpath(locators.getProperty("merkdd"))).click();

		driver.findElement(By.xpath(locators.getProperty("merk_search_input"))).sendKeys(Merk);
		driver.findElement(By.xpath(locators.getProperty("merk_filter_val_select"))).click();
	}

	private static void Eigenschapdropdown(String Eigenschap) {
		
		driver.findElement(By.xpath(locators.getProperty("Eigenschapdd"))).click();

		driver.findElement(By.xpath(locators.getProperty("Eigenschap_search_input"))).sendKeys(Eigenschap);

		driver.findElement(By.xpath(locators.getProperty("eigenschap_filter_select"))).click();

	}

	private static void voorwiedropdown(String Fur_wen) {

		
		driver.findElement(By.xpath(locators.getProperty("voor_wie_dd"))).click();

		if (Fur_wen.toLowerCase() == "female") {

			driver.findElement(By.xpath(locators.getProperty("voor_female"))).click();
		}

		if (Fur_wen.toLowerCase() == "male") {
			driver.findElement(By.xpath(locators.getProperty("voor_male"))).click();
		}

		if (Fur_wen.toLowerCase() == "unisex") {
			
			driver.findElement(By.xpath(locators.getProperty("voor_unisex"))).click();
		}

	}

	

}
