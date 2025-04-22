import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page pagina;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        pagina = new tc_008Page(driver);
    }

    @Given("el usuario identifica una fila en el Excel correspondiente a un movimiento de 'pago'")
    public void identificarFila() {
        // Implementar métodos para abrir el Excel y encontrar el movimiento de 'pago'
        boolean isRowIdentified = pagina.identificarFilaPago();
        assertTrue("El registro de pago es visible y corresponde a un movimiento válido.", isRowIdentified);
    }

    @When("el usuario verifica la fórmula en la celda 'Monto Acumulado Folio OPC 2121'")
    public void verificarFormula() {
        // Implementar métodos para acceder a la celda y verificar la fórmula
        String formula = pagina.obtenerFormula();
        assertEquals("=Z4+AD5+AE5+AH5+AC5+AB5+AM5", formula);
    }

    @Then("la fórmula debe ser =Z4+AD5+AE5+AH5+AC5+AB5+AM5 y calcular correctamente usando datos de prueba")
    public void calcularCorrectamente() {
        // Implementar la lógica de verificación de cálculos
        double result = pagina.calcularMontoConFormula();
        assertEquals(pagina.obtenerResultadoEsperado(), result, 0.01);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}