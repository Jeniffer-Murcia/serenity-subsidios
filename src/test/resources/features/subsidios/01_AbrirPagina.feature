Feature: Acceso inicial y selección del programa de subsidios
  Como usuario del sistema de subsidios
  Quiero ingresar a la plataforma PAEF y seleccionar el programa de subsidios
  Para poder iniciar el proceso de postulación

  @TC_001
  Scenario: Ingresar a la página de subsidios
    Given el usuario navega a la página de subsidios
    Then el usuario visualiza el título "Programa Empleo para la vida, Fomento y protección para nuevos empleos"

  @TC_002
  Scenario: Validar que la fecha de postulación está abierta
    Given el usuario está en la pantalla del programa "Empleo para la vida"
    Then se muestra el estado " ABIERTO: desde el 7 de Agosto del 2025 al 30 de Agosto del 2025 hasta las 4:00 p. m. " en la fecha de postulación
    And el usuario hace clic sobre el programa

  @Wip
  @TC_003
  Scenario: Seleccionar el programa "Empleo para la vida"
    Given el usuario accede al panel principal de subsidios
    When hace clic en la tarjeta con el texto "Programa Empleo para la vida, Fomento y protección para nuevos empleos"
    Then el sistema abre la pantalla de radicación de formulario

  @Wip
  @TC_004
  Scenario: Intentar seleccionar programa en estado cerrado
    Given el usuario accede al panel de programas
    When intenta hacer clic en una tarjeta con estado "Cerrado"
    Then se muestra un mensaje "El programa no admite postulaciones"

  @Wip
  @TC_005
  Scenario: Validar habilitación de ventanas emergentes
    Given el usuario da clic en la tarjeta de "Programa Empleo para la vida, Fomento y protección para nuevos empleos"
    When accede aparece el modal "Antes de comenzar"
    Then el sistema solicita habilitar ventanas emergentes
    And el usuario hace clic en "Salir"
