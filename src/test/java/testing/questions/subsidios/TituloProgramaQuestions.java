package testing.questions.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.ui.subsidios.AbrirPaginaUI.TITULO_PROGRAMA;

public class TituloProgramaQuestions implements Question<String> {
    @Override
    // Aquí devolvemos lo que el actor ve en el Target
    public String answeredBy (Actor actor){
        actor.attemptsTo(
                WaitUntil.the(TITULO_PROGRAMA, isVisible()).forNoMoreThan(15).seconds());
        return Text.of(TITULO_PROGRAMA).answeredBy(actor);
    }

    //Metodo estático que se usará en los stepdefinitions
    public static Question<String> textoDelTitulo(){
        return new TituloProgramaQuestions();
    }

}
