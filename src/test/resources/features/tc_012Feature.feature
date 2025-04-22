Feature: Renombrado de columna 'Status de Pago'

  Scenario: Verificar renombrado de columna en Excel
    Given La columna 'Status de Pago' es identificada en el Excel
    When El encabezado es renombrado a 'Descripción Status Pago'
    Then El encabezado se muestra como 'Descripción Status Pago' manteniendo el contenido original.