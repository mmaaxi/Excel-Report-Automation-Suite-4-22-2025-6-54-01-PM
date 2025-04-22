Feature: Verificar creación de columna 'Folio Pre solicitud'

  Scenario: Insertar columna 'Folio Pre solicitud' junto a 'Ramo'
    Given el usuario tiene un archivo Excel abierto
    When localiza el campo 'Ramo' en el Excel
    Then el campo 'Ramo' es visible
    And se inserta a la derecha de 'Ramo' la columna 'Folio Pre solicitud' sin datos
    And la columna se crea en la posición adecuada y aparece vacía