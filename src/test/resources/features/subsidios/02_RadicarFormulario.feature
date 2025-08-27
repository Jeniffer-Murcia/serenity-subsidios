Feature: Radicación del formulario de subsidios
  Como empleador que aplica al subsidio
  Quiero radicar el formulario inicial
  Para continuar con la postulación

  @TC_006
  Scenario: Ingresar datos básicos de identificación
    Given el usuario está en la pantalla de radicación de formulario
    When ingresa el tipo de identificación "NIT"
    And escribe el número de identificación "900123456"
    And escribe el dígito de verificación "5"
    Then los campos de identificación muestran la información ingresada

  @TC_007
  Scenario: Seleccionar el mes de postulación
    Given el usuario completó la información de identificación
    When selecciona el mes "Mayo - Periodo 43" del menú desplegable
    Then el sistema refleja la selección realizada

  @TC_008
  Scenario: Continuar con la radicación del formulario
    Given el usuario ha diligenciado identificación y mes de postulación
    When hace clic en el botón "Continuar"
    Then el sistema muestra la pantalla de Preguntas Iniciales
