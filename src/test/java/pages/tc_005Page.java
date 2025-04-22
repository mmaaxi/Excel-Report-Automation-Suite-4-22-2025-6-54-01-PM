package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;
    By columnaReserva = By.xpath("//th[contains(text(), 'Monto (reserva)')]");
    By columnaNueva = By.xpath("//th[contains(text(), 'Monto acumulado Folio Reserva 5401')]");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean esColumnaReservaPresente() {
        return driver.findElement(columnaReserva).isDisplayed();
    }

    public boolean esColumnaNuevaPresente() {
        WebElement reservaColumna = driver.findElement(columnaReserva);
        WebElement nuevaColumna = driver.findElement(By.xpath("//th[contains(text(), 'Monto acumulado Folio Reserva 5401')]"));
        return nuevaColumna.isDisplayed() && reservaColumna.findElement(By.xpath("following-sibling::th[1]")).equals(nuevaColumna);
    }

    public boolean esNuevaColumnaEnPosicionCorrecta() {
        WebElement reservaColumna = driver.findElement(columnaReserva);
        WebElement nuevaColumna = driver.findElement(columnaNueva);
        return nuevaColumna.equals(reservaColumna.findElement(By.xpath("following-sibling::th[1]")));
    }

    public void seleccionarCeldaNuevaColumna() {
        driver.findElement(By.xpath("//table//tr[1]//td[position()=last()]")).click();
    }

    public boolean verificarFormulaSumaAcumulada() {
        WebElement celdaActual = driver.findElement(By.xpath("//table//tr[1]//td[position()=last()]"));
        WebElement celdaAnterior = driver.findElement(By.xpath("//table//tr[1]//td[position()=last()-1]"));
        double valorActual = Double.parseDouble(celdaActual.getText());
        double valorAnterior = Double.parseDouble(celdaAnterior.getText());

        // Lógica para calcular y verificar la suma acumulada
        return valorActual == (valorAnterior + obtenerMontoActual());
    }

    private double obtenerMontoActual() {
        WebElement celdaMontoActual = driver.findElement(By.xpath("//table//tr[1]//td[position()=last()-2]"));
        return Double.parseDouble(celdaMontoActual.getText());
    }
}