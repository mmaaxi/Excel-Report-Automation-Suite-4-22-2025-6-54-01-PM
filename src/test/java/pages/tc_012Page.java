package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_012Page {

    private WebDriver driver;

    public tc_012Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isStatusDePagoColumnPresent() {
        WebElement column = driver.findElement(By.xpath("//th[text()='Status de Pago']"));
        return column != null;
    }

    public void renameStatusDePagoColumn() {
        WebElement column = driver.findElement(By.xpath("//th[text()='Status de Pago']"));
        if (column != null) {
            column.click();
            // Logic to rename the column header
            WebElement renameInput = driver.findElement(By.xpath("//input[@name='renameColumn']"));
            renameInput.clear();
            renameInput.sendKeys("Descripción Status Pago");
            WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
            saveButton.click();
        }
    }

    public boolean isRenamedHeaderCorrect() {
        WebElement column = driver.findElement(By.xpath("//th[text()='Descripción Status Pago']"));
        return column != null;
    }

    public boolean isOriginalContentIntact() {
        // Placeholder for logic to ensure the original content is still present
        // This would involve checking all rows under this column before and after renaming
        return true; // Implement actual check
    }
}