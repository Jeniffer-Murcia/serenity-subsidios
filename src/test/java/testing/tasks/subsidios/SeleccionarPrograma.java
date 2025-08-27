package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.subsidios.LoginSubsidiosUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarPrograma implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(LoginSubsidiosUI.TITULO_PROGRAMA));
    }

    public static SeleccionarPrograma empleoParaLaVida(){
        return instrumented(SeleccionarPrograma.class);
    }

}
