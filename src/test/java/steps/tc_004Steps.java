package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("El Excel exportado está abierto")
    public void abrirExcelExportado() {
        // Código para abrir el archivo Excel exportado
    }

    @When("Localizar la columna 'estado'")
    public void localizarColumnaEstado() {
        boolean isColumnIdentifiable = page.isEstadoColumnIdentifiable();
        Assert.assertTrue("La columna 'estado' no es identificable", isColumnIdentifiable);
    }

    @Then("La columna 'estado' es identificable")
    public void verificarColumnaEstadoIdentifiable() {
        // Verificación realizada en el paso anterior
    }

    @When("Revisar los valores según lo descrito en 'Figura 3 – ID 11'")
    public void revisarValoresFigura3ID11() {
        boolean areValuesCorrect = page.verifyEstadoValues();
        Assert.assertTrue("Los valores de la columna 'estado' no se han actualizado conforme a la especificación", areValuesCorrect);
    }

    @Then("Los valores se han actualizado conforme a la especificación")
    public void verificarActualizacionValores() {
        // Verificación realizada en el paso anterior
    }
}