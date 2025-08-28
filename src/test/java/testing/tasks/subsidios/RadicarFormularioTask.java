package testing.tasks.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.subsidios.RadicarSubsidiosUI.*;

public class RadicarFormularioTask implements Task {

    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String digitoVerificacion;
    private final String mes;

    public RadicarFormularioTask(String tipoDocumento, String numeroDocumento, String digitoVerificacion, String mes) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.digitoVerificacion = digitoVerificacion;
        this.mes = mes;
    }

    public static RadicarFormularioTask conDatos(String tipoDocumento, String numeroDocumento, String digitoVerificacion, String mes) {
        return instrumented(RadicarFormularioTask.class, tipoDocumento,numeroDocumento,digitoVerificacion,mes);
    }

    @Override
    public <T extends Actor>  void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RADIO_RADICAR_FORMULARIO),
                SelectFromOptions.byValue(tipoDocumento).from(SELECCION_TIPO_DOCUMENTO),
                Enter.theValue(numeroDocumento).into(INGRESO_NUMERO_DOCUMENTO),
                Enter.theValue(digitoVerificacion).into(INGRESO_DIGITO_VERIFICACION),
                SelectFromOptions.byVisibleText(mes).from(SELECCION_MES_POSTULACION),
                Click.on(BOTON_CONTINUAR)

        );
    }
}
