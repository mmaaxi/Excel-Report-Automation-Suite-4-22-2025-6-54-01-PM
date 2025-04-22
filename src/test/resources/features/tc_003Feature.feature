Feature: Inclusión de Columna 'Estado Código'

  Scenario: Verificar la existencia y posición correcta de la columna 'Estado Código'
    Given el usuario abre el archivo Excel
    When el usuario revisa los encabezados de las columnas
    Then la columna 'Estado Código' se encuentra justo a la derecha de la columna 'i'
    And la columna 'Estado Código' está en la posición exacta definida en el requerimiento