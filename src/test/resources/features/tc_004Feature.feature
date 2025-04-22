Feature: Actualización de campos en la columna 'estado'

  Scenario: Actualizar y verificar los valores de la columna 'estado'
    Given El Excel exportado está abierto
    When Localizar la columna 'estado'
    Then La columna 'estado' es identificable
    When Revisar los valores según lo descrito en 'Figura 3 – ID 11'
    Then Los valores se han actualizado conforme a la especificación