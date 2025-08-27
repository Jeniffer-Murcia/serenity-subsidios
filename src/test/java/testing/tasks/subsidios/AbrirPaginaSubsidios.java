package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import testing.ui.subsidios.PaginaSubsidiosUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaSubsidios implements Task {

    private PaginaSubsidiosUI pagina; // referencia al PageObject

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina));
    }

    public static AbrirPaginaSubsidios enLaPagina() {
        return instrumented(AbrirPaginaSubsidios.class);
    }
}
