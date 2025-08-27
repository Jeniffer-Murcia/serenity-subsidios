package testing.stepdefinitions.subsidios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testing.questions.subsidios.EstadoPrograma;
import testing.tasks.subsidios.AbrirPaginaSubsidios;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class EstadoProgramaSteps {
    @Given("el usuario está en la pantalla del programa {string}")
    public void usuario_en_pantalla_programa(String tituloEsperado) {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaSubsidios.enLaPagina());
    }

    @Then("se muestra el estado {string} en la fecha de postulación")
    public void validar_estado_programa(String estadoEsperado) {
        theActorInTheSpotlight().should(seeThat("El estado del programa", EstadoPrograma.textoEstadoAbierto(), equalTo(estadoEsperado)));
    }

    @Then("el usuario hace clic sobre el programa")
    public void el_usuario_hac_clic_sobre_el_programa() {
        theActorInTheSpotlight().attemptsTo(ClicEstadoAbierto.enElPrograma());
    }
}
