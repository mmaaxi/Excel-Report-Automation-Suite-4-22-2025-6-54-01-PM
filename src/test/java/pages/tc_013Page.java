package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_013Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By ivaColumnLocator = By.id("iva_acumulado_column");
    private By formulaLocator = By.id("iva_formula");

    public tc_013Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void openDocument() {
        // Implement logic to open the document
    }

    public void locateIvaColumn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ivaColumnLocator));
    }

    public boolean isIvaColumnVisible() {
        WebElement ivaColumn = driver.findElement(ivaColumnLocator);
        return ivaColumn.isDisplayed();
    }

    public void checkIvaFormula() {
        WebElement formulaElement = driver.findElement(formulaLocator);
        String formula = formulaElement.getAttribute("value");
        // Add logic to check the formula content
    }

    public boolean isFormulaCorrect() {
        // Implement the logic to verify if the formula is correct
        return true; // This should be the actual check result
    }
}