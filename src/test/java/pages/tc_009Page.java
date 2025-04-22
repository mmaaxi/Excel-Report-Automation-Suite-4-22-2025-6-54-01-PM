package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    private By ramoField = By.xpath("//table//td[text()='Ramo']");
    private By folioPreSolicitudColumn = By.xpath("//table//td[text()='Folio Pre solicitud']");

    public boolean isRamoFieldVisible() {
        WebElement ramoElement = driver.findElement(ramoField);
        return ramoElement.isDisplayed();
    }

    public boolean isFolioPreSolicitudInsertedCorrectly() {
        WebElement folioColumnElement = driver.findElement(folioPreSolicitudColumn);
        // Logic to verify if the column is next to 'Ramo'.
        WebElement ramoElement = driver.findElement(ramoField);
        return folioColumnElement.isDisplayed() && folioColumnElement.getLocation().getY() == ramoElement.getLocation().getY();
    }

    public boolean isFolioPreSolicitudColumnEmpty() {
        WebElement folioColumnElement = driver.findElement(folioPreSolicitudColumn);
        // Logic to confirm column is empty (e.g., no child nodes with data).
        return folioColumnElement.getText().isEmpty();
    }
}