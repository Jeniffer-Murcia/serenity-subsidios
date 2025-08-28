package testing.questions.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static testing.ui.subsidios.AbrirPaginaUI.ESTADO_PROGRAMA;

public class EstadoProgramaQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ESTADO_PROGRAMA).answeredBy(actor).toString().trim().replaceAll("\\s+", " ");
    }

    public static  Question<String> textoEstadoAbierto() {
        return new EstadoProgramaQuestion();
    }
}
