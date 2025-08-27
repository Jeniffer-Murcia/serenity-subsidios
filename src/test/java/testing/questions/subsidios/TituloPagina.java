package testing.questions.subsidios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static testing.ui.subsidios.LoginSubsidiosUI.TITULO_PROGRAMA;

public class TituloPagina implements Question<String> {

    @Override
    // Aquí devolvemos lo que el actor ve en el Target
    public String answeredBy (Actor actor){
        return Text.of(TITULO_PROGRAMA).answeredBy(actor);
    }

    //Metodo estático que se usará en los stepdefinitions
    public static Question<String> textoDelTitulo(){
        return new TituloPagina();
    }
}
