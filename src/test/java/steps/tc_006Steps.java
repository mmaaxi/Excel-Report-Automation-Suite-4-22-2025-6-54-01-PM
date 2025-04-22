package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    @Given("estoy en la página de tabla")
    public void estoy_en_la_pagina_de_tabla() {
        // Inicializar el controlador (driver) y la página
        driver = // Instancia de WebDriver
        page = new tc_006Page(driver);
    }

    @When("reviso el encabezado de la columna 'Monto Acumulado Folio OPC'")
    public void reviso_el_encabezado_de_la_columna() {
        page.navigateToTablePage();
        page.checkColumnName();
    }

    @Then("el encabezado debe mostrarse como 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void el_encabezado_debe_mostrarse_como() {
        String expectedHeader = "Monto Acumulado Folio OPC (2121)";
        String actualHeader = page.getHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }
}