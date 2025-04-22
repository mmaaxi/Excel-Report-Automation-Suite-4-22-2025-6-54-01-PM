Feature: Verificar nueva columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar presencia y cálculo de la nueva columna
    Given la columna 'Monto (reserva)' está presente
    When verifico que a su derecha aparece la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna 'Monto acumulado Folio Reserva 5401' está presente en la posición correcta
    When selecciono una celda de la columna 'Monto acumulado Folio Reserva 5401'
    Then la suma acumulada en la celda se calcula correctamente