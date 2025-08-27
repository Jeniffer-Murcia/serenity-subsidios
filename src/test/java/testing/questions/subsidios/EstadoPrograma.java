package testing.questions.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static testing.ui.subsidios.EstadoAbierto.ESTADO_PROGRAMA_ABIERTO;

public class EstadoPrograma implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ESTADO_PROGRAMA_ABIERTO).answeredBy(actor).toString().trim().replaceAll("\\s+", " ");
    }

    public static  Question<String> textoEstadoAbierto() {
        return new EstadoPrograma();
    }
}
