Feature: Acceso inicial y selección del programa de subsidios
Como usuario del sistema de subsidios
Quiero validar el acceso inicial a la plataforma
Para confirmar títulos, estados y acceso a programas

  @TC_001
  Scenario: Ingresar a la página de subsidios
    Given el usuario navega a la página de subsidios
    Then el usuario visualiza el título "Programa Empleo para la vida, Fomento y protección para nuevos empleos"

  @TC_002
  Scenario: Validar que la fecha de postulación está abierta
    Given el usuario está en la pantalla del programa "Empleo para la vida"
    Then se muestra el estado "ABIERTO: desde el 7 de Agosto del 2025 al 30 de Agosto del 2025 hasta las 4:00 p. m." en la fecha de postulación

  @TC_003
  Scenario: Intentar seleccionar programa en estado cerrado
    Given el usuario accede al panel de programas
    When intenta hacer clic en una tarjeta con estado "CERRADO"
    Then se muestra un mensaje "Cronograma por definir"

