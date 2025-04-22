Feature: Verificar inclusión de la columna 'Status Pago Código'

  Scenario: Confirmar la inclusión y posición de la columna 'Status Pago Código'
    Given estoy en la hoja de Excel
    When ubico la columna 'Fecha de Pago'
    Then la columna 'Fecha de Pago' es visible
    And confirmo que a la derecha de 'Fecha de Pago' está la columna 'Status Pago Código'
    And la columna 'Status Pago Código' está vacía