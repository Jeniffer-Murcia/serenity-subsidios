package testing.stepdefinitions.subsidios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.tasks.subsidios.AbrirPaginaSubsidiosTask;
import testing.tasks.subsidios.RadicarFormularioTask;
import testing.tasks.subsidios.SeleccionarProgramaTask;
import testing.ui.subsidios.RadicarSubsidiosUI;

public class RadicarFormularioSteps {

    private String tipoDocumento;
    private String numeroDocumento;
    private String digitoVerificacion;
    private String mes;

    // Background
    @Given("el cliente abre la página de subsidios")
    public void clienteAbrePagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirPaginaSubsidiosTask.enLaPagina());
    }

    @When("selecciona el programa {string}")
    public void seleccionaPrograma(String programa) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProgramaTask.enPantalla());
    }

    @And("cierra la ventana emergente {string}")
    public void cierraVentanaEmergente(String modal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RadicarSubsidiosUI.BOTON_SALIR_MODAL_VENTANAS_EMERGENTES)
        );
    }

    // Escenario TC_004
    @Given("selecciona la opción {string}")
    public void seleccionaOpcion(String opcion) {
        // se ejecuta dentro del Task RadicarFormularioTask
    }

    @When("selecciona el tipo de documento {string}")
    public void seleccionaTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @And("ingresa el número de identificación {string}")
    public void ingresaNumeroIdentificacion(String numero) {
        this.numeroDocumento = numero;
    }

    @And("ingresa el dígito de verificación {string}")
    public void ingresaDigitoVerificacion(String digito) {
        this.digitoVerificacion = digito;
    }

    @And("selecciona el mes de postulación {string}")
    public void seleccionaMes(String mes) {
        this.mes = mes;
    }

    @Then("hace clic en el botón continuar")
    public void haceClicBotonContinuar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RadicarFormularioTask.conDatos(tipoDocumento, numeroDocumento, digitoVerificacion, mes)
        );
    }

    // Escenario TC_005
    @And("se ingresa la información errada")
    public void seIngresaInformacionErrada() {
        this.tipoDocumento = "C";
        this.numeroDocumento = ""; // simula vacío o inválido
        this.digitoVerificacion = "0";
        this.mes = "Enero";
    }

    @Then("el sistema muestra el mensaje {string}")
    public void sistemaMuestraMensaje(String mensaje) {
        // Aquí puedes usar Ensure + Question para validar
        // Ejemplo:
        // Ensure.that(MensajeErrorQuestion.textoDelError()).isEqualTo(mensaje);
    }

    // Escenario TC_006
    @And("completa la identificación con datos válidos")
    public void completaIdentificacionValida() {
        this.tipoDocumento = "N";
        this.numeroDocumento = "901562458";
        this.digitoVerificacion = "9";
    }

    @When("selecciona el mes {string}")
    public void seleccionaMesPostulacion(String mes) {
        this.mes = mes;
    }

    @And("el cliente hace clic en {string}")
    public void clienteHaceClickEn(String boton) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RadicarFormularioTask.conDatos(tipoDocumento, numeroDocumento, digitoVerificacion, mes)
        );
    }

    @Then("el sistema refleja la selección realizada")
    public void sistemaReflejaSeleccion() {
        // Aquí podrías validar que el campo quedó seteado con Ensure
    }
}
