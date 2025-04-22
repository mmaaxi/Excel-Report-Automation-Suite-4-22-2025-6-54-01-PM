Feature: Actualización de fórmula en movimientos de 'pago'

  Scenario: Verificar fórmula en movimientos de pago
    Given el usuario identifica una fila en el Excel correspondiente a un movimiento de 'pago'
    When el usuario verifica la fórmula en la celda 'Monto Acumulado Folio OPC 2121'
    Then la fórmula debe ser =Z4+AD5+AE5+AH5+AC5+AB5+AM5 y calcular correctamente usando datos de prueba