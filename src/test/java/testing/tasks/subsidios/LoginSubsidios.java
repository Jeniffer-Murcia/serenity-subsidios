package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.subsidios.LoginSubsidiosUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSubsidios implements Task {
    private final String tipoDoc;
    private final String numeroDoc;

    public LoginSubsidios(String tipoDoc, String numeroDoc){
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginSubsidiosUI.SELECCION_RADICAR_FORMULARIO),
                SelectFromOptions.byValue(tipoDoc).from(LoginSubsidiosUI.SELECCION_TIPO_DOCUMENTO),
                Enter.theValue(numeroDoc).into(LoginSubsidiosUI.INGRESO_IDENTIFICACION),
                Click.on(LoginSubsidiosUI.BOTON_CONTINUAR)
        );
    }

    public static LoginSubsidios con(String tipoDoc, String numeroDoc) {
        return instrumented(LoginSubsidios.class, tipoDoc, numeroDoc);
    }
}
