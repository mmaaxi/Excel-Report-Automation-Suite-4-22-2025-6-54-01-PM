Feature: Verificar creación de columna 'Folio de Pago'

  Scenario: Confirmar creación y propiedades de la columna 'Folio de Pago'
    Given el usuario está en la página de tabla de datos
    When el usuario verifica la existencia de la columna 'Folio de Pago'
    Then la columna 'Folio de Pago' debería aparecer inmediatamente a la derecha de 'Folio Pre solicitud'
    And la columna 'Folio de Pago' debería estar vacía