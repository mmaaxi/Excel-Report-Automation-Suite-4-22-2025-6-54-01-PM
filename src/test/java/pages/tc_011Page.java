package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_011Page {

    private WebDriver driver;
    private By fechaDePagoColumn = By.xpath("//th[contains(text(), 'Fecha de Pago')]");
    private By statusPagoCodigoColumn = By.xpath("//th[contains(text(), 'Status Pago Código')]");

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExcelSheet() {
        driver.get("http://path-to-your-excel-file");
    }

    public boolean isFechaDePagoColumnVisible() {
        WebElement column = driver.findElement(fechaDePagoColumn);
        return column != null && column.isDisplayed();
    }

    public boolean isStatusPagoCodigoColumnAtRightPosition() {
        WebElement fechaDePagoCol = driver.findElement(fechaDePagoColumn);
        WebElement statusPagoCodigoCol = driver.findElement(statusPagoCodigoColumn);
        return fechaDePagoCol.findElement(By.xpath("following-sibling::th[1]")).equals(statusPagoCodigoCol);
    }

    public boolean isStatusPagoCodigoColumnEmpty() {
        WebElement statusPagoCodigoCol = driver.findElement(statusPagoCodigoColumn);
        return statusPagoCodigoCol.getText().isEmpty();
    }
}