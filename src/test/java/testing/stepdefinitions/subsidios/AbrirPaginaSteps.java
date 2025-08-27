package testing.stepdefinitions.subsidios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import testing.questions.subsidios.TituloPagina;
import testing.tasks.subsidios.AbrirPaginaSubsidios;
import testing.ui.subsidios.LoginSubsidiosUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class AbrirPaginaSteps {
    @Given("el usuario navega a la página de subsidios")
    public void abrirPagina() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaSubsidios.enLaPagina());
    }

    @Then("el usuario visualiza el título {string}")
    public void el_usuario_visualiza_el_titulo(String tituloEsperado) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(Text.of(LoginSubsidiosUI.TITULO_PROGRAMA)).isEqualTo(tituloEsperado));
    }
}