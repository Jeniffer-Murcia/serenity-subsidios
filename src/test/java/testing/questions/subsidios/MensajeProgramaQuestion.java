package testing.questions.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import testing.ui.subsidios.AbrirPaginaUI;

public class MensajeProgramaQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AbrirPaginaUI.MENSAJE_PROGRAMA_CERRADO).answeredBy(actor).trim();
    }

    public static Question<String> textoDelMensaje() {
        return new MensajeProgramaQuestion();
    }
}
