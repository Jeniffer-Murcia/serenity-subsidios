package testing.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Espera {
    @Before
    public void prepararEscenario() {
        // Inicializa el "casting" de actores
        OnStage.setTheStage(new OnlineCast());
        // Crea un actor llamado "Usuario"
        OnStage.theActorCalled("Usuario");
    }
}
