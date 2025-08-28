package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.subsidios.AbrirPaginaUI;

public class SeleccionarProgramaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AbrirPaginaUI.TARJETA_PROGRAMA));
    }

    public static SeleccionarProgramaTask enPantalla() {
        return new SeleccionarProgramaTask();
    }
}
