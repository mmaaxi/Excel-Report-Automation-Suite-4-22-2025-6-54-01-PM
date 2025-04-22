Feature: Modificación de la fórmula en la columna 'IVA Acumulado'

  Scenario: Verificar y modificar la fórmula de la columna 'IVA Acumulado'
    Given el usuario tiene acceso al documento Excel con la columna 'IVA Acumulado'
    When el usuario localiza la columna 'IVA Acumulado'
    Then la columna 'IVA Acumulado' se encuentra visible
    When el usuario revisa la fórmula en la columna 'IVA Acumulado'
    Then la fórmula muestra la suma correcta de los IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO, excluyendo el IVA retenido