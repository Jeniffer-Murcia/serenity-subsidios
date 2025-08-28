package testing.stepdefinitions.subsidios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.questions.subsidios.EstadoProgramaQuestion;
import testing.questions.subsidios.TituloProgramaQuestions;
import testing.tasks.subsidios.AbrirPaginaSubsidiosTask;
import testing.tasks.subsidios.SeleccionarProgramaTask;
import testing.ui.subsidios.AbrirPaginaUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirPaginaSubsidiosSteps {

    @Given("el usuario navega a la página de subsidios")
    public void elUsuarioNavegaALaPagina() {
        theActorInTheSpotlight().attemptsTo(AbrirPaginaSubsidiosTask.enLaPagina());
    }

    @Then("el usuario visualiza el título {string}")
    public void elUsuarioVisualizaElTitulo(String tituloEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TituloProgramaQuestions.textoDelTitulo()).isEqualTo(tituloEsperado)
        );
    }

    @Given("el usuario está en la pantalla del programa {string}")
    public void elUsuarioEstaEnLaPantalla(String programa) {
        theActorInTheSpotlight().attemptsTo(AbrirPaginaSubsidiosTask.enLaPagina());
        // Aquí podrías usar SeleccionarProgramaTask si se requiere hacer clic en ese programa
    }

    @Then("se muestra el estado {string} en la fecha de postulación")
    public void seMuestraElEstado(String estadoEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(EstadoProgramaQuestion.textoEstadoAbierto()).isEqualTo(estadoEsperado)
        );
    }

    @Given("el usuario accede al panel de programas")
    public void elUsuarioAccedeAlPanelDeProgramas() {
        theActorInTheSpotlight().attemptsTo(
                AbrirPaginaSubsidiosTask.enLaPagina()
        );
    }

    @When("intenta hacer clic en una tarjeta con estado {string}")
    public void intentaHacerClick(String estado) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProgramaTask.enPantalla());
    }

    @Then("se muestra un mensaje {string}")
    public void seMuestraUnMensaje(String mensajeEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(AbrirPaginaUI.MENSAJE_PROGRAMA_CERRADO)
                        .text()
                        .isEqualTo(mensajeEsperado)
        );
    }

}