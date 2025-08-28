package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import testing.ui.subsidios.AbrirPaginaUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaSubsidiosTask implements Task {

    private final AbrirPaginaUI pagina;

    public AbrirPaginaSubsidiosTask(AbrirPaginaUI pagina) {
        this.pagina = pagina;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina));
    }

    public static AbrirPaginaSubsidiosTask enLaPagina() {
        return instrumented(AbrirPaginaSubsidiosTask.class, new AbrirPaginaUI());
    }
}
