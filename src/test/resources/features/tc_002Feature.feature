Feature: Validación de llave en Columna C

  Scenario: Verificación de la columna C en Excel exportado
    Given el usuario abre el archivo Excel exportado
    When ubica la columna C
    Then la columna C es visible y contiene datos

    When el usuario selecciona la fila 2
    And revisa que la celda contenga la fórmula correctamente
    Then la celda muestra la concatenación correcta de los valores