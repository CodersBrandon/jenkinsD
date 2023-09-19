Feature: Buscar hotel
  Como un usuario del sistema
  Quiero realizar una busqueda de hoteles disponibles en una ciudad
  Para realizar un viaje de vacación.
  Scenario: Buscar hoteles en una ciudad
    Given el usuario esta en la página principal del sistema
    When el usuario busca hoteles en la ciudad de "Tarija"
    Then el sistema muestra una lista de hoteles disponibles en la ciudad "Tarija"
    And cada hotel muestra su nombre, direccion, precio por noche y calificacion.

  Scenario: Buscar hoteles en una ciudad sin hoteles disponibles
    Given el usuario esta en la página principal del sistema
    When el usuario busca hoteles en la ciudad de "Cochabamba"
    Then el sistema muestra un mensaje indicando que no hay hoteles disponibles en "Cochabamba"