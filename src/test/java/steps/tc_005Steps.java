package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page page = new tc_005Page(driver);

    @Given("la columna 'Monto (reserva)' está presente")
    public void verificarColumnaReserva() {
        assertTrue(page.esColumnaReservaPresente());
    }

    @When("verifico que a su derecha aparece la columna 'Monto acumulado Folio Reserva 5401'")
    public void verificarNuevaColumnaAdyacente() {
        assertTrue(page.esColumnaNuevaPresente());
    }

    @Then("la columna 'Monto acumulado Folio Reserva 5401' está presente en la posición correcta")
    public void verificarPosicionNuevaColumna() {
        assertTrue(page.esNuevaColumnaEnPosicionCorrecta());
    }

    @When("selecciono una celda de la columna 'Monto acumulado Folio Reserva 5401'")
    public void seleccionarCeldaNuevaColumna() {
        page.seleccionarCeldaNuevaColumna();
    }

    @Then("la suma acumulada en la celda se calcula correctamente")
    public void verificarCalculoSumaAcumulada() {
        assertTrue(page.verificarFormulaSumaAcumulada());
    }
}