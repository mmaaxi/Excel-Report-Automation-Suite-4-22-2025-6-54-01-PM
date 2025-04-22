package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class tc_010Page {

    private WebDriver driver = Driver.getDriver();
    private By folioPreSolicitudLocator = By.xpath("//th[contains(text(), 'Folio Pre solicitud')]");
    private By folioDePagoLocator = By.xpath("//th[contains(text(), 'Folio de Pago')]");
    
    public void navigateToPage() {
        driver.get("URL_DE_LA_PÁGINA_DE_TABLA_DE_DATOS");
    }

    public void checkColumns() {
        // This method can have setup or assertions as needed
    }

    public boolean isFolioDePagoToRightOfFolioPreSolicitud() {
        WebElement folioPreSolicitudElement = driver.findElement(folioPreSolicitudLocator);
        WebElement folioDePagoElement = driver.findElement(folioDePagoLocator);

        // Assuming columns are in the same parent and structured linearly
        List<WebElement> headers = driver.findElements(By.xpath("//th"));
        int folioPreIndex = headers.indexOf(folioPreSolicitudElement);
        int folioDePagoIndex = headers.indexOf(folioDePagoElement);

        return folioDePagoIndex == folioPreIndex + 1;
    }
    
    public boolean isFolioDePagoColumnEmpty() {
        List<WebElement> columnData = driver.findElements(By.xpath("//td[count(//th[contains(text(), 'Folio de Pago')]/preceding-sibling::th)+1]"));
        for (WebElement data : columnData) {
            if (!data.getText().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}