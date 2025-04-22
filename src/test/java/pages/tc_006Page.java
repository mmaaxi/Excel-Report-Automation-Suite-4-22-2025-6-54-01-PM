package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    // Selector para el encabezado de la columna
    By columnHeader = By.xpath("//th[contains(text(),'Monto Acumulado Folio OPC')]");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToTablePage() {
        // Código para navegar a la página adecuada
    }

    public void checkColumnName() {
        // Código para verificar que la columna esté presente
        driver.findElement(columnHeader);
    }

    public String getHeaderText() {
        return driver.findElement(columnHeader).getText();
    }
}