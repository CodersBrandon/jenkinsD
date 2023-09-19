# language: es
Característica: Reservar una habitación
Como un cliente registrado
Quiero reservar una habitación en un hotel
Para asegurar mi estancia durante mis viajes

Antecedentes:
  Dado que estoy registrado en el sistema
  Y he iniciado sesión con mi cuenta de usuario
  Y hay hoteles con habitaciones disponibles

Escenario: Reserva exitosa de una habitación
  Cuando selecciono el hotel "Hotel Luna Azul"
  Y elijo la habitación tipo "Suite"
  Y selecciono la fecha de inicio "13/09/2023" y fecha final "25/09/2023"
  Y presiono el botón "Reservar"
  Entonces debería ver un mensaje confirmando "Reserva realizada con éxito"
  Y la habitación "Suite" del hotel "Hotel Luna Azul" debería estar marcada como "Reservada" para esas fechas

Escenario: Reserva fallida por habitación no disponible
  Cuando selecciono el hotel "Hotel Sol Dorado"
  Y elijo una habitación que ya está reservada tipo "Doble"
  Y selecciono la fecha de inicio "13/09/2023" y fecha final "25/09/2023"
  Y presiono el botón "Reservar"
  Entonces debería ver un mensaje de error "Habitación no disponible para las fechas seleccionadas"
