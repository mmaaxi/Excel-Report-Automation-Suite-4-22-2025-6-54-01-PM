Feature: Renombrado de columna 'Monto Acumulado Folio OPC'

  Scenario: Verificar el encabezado de la columna renombrada
    Given estoy en la página de tabla
    When reviso el encabezado de la columna 'Monto Acumulado Folio OPC'
    Then el encabezado debe mostrarse como 'Monto Acumulado Folio OPC (2121)'