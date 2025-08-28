Feature: Radicación del formulario de subsidios
  Como empleador que aplica al subsidio
  Quiero radicar el formulario inicial
  Para continuar con la postulación

  Background:
    Given el cliente abre la página de subsidios
    When selecciona el programa "Programa Empleo para la vida"
    And cierra la ventana emergente "Antes de comenzar"

  @TC_004
  Scenario: Ingreso de credenciales válidas para radicar formulario
    Given selecciona la opción "Radicar formulario"
    When selecciona el tipo de documento "N"
    And ingresa el número de identificación "901562458"
    And ingresa el dígito de verificación "9"
    And selecciona el mes de postulación "Mayo"
    Then hace clic en el botón continuar

  @Wip
  @TC_005
  Scenario: Validar error al no ingresar número de identificación errado
    Given selecciona la opción "Radicar formulario"
    When selecciona el tipo de documento "C"
    And se ingresa la información errada
    Then el sistema muestra el mensaje "Debe ingresar el número de identificación"

  @TC_006
  Scenario: Seleccionar mes de postulación
    Given selecciona la opción "Radicar formulario"
    And completa la identificación con datos válidos
    When selecciona el mes "Mayo"
    And el cliente hace clic en "Continuar"
    Then el sistema refleja la selección realizada

    @Wip
    @TC_008
    Scenario: Escenario pendiente
