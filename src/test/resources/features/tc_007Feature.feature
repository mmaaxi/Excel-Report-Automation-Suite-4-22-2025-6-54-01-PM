Feature: Inclusión de columnas para IVA

  Scenario: Validación de columnas IVA en Excel
    Given El usuario abre el documento Excel
    When Busca las columnas "IVA 0%", "IVA exento", "IVA retenido"
    Then Las tres columnas están presentes en las posiciones definidas
    And Valida que cada columna se llene con los montos correspondientes según la tasa de IVA
    Then Cada columna muestra los montos correctos o se mantiene vacía en caso de no aplicar