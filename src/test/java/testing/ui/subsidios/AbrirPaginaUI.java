package testing.ui.subsidios;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")

public class AbrirPaginaUI extends PageObject {
    // Título del programa activo
    public static final Target TITULO_PROGRAMA = Target.the("Título del programa")
            .located(By.cssSelector("div.card h3"));

    // Estado del programa (ejemplo: ABIERTO o CERRADO)
    public static final Target ESTADO_PROGRAMA = Target.the("Estado del programa")
            .located(By.cssSelector("div.card p"));

    // Tarjeta genérica del programa
    public static final Target TARJETA_PROGRAMA = Target.the("Tarjeta de programa")
            .located(By.cssSelector("div.card"));

    // Modal de error cuando el programa está cerrado
    public static final Target MENSAJE_PROGRAMA_CERRADO = Target.the("Mensaje de programa cerrado")
            .located(By.xpath("//*[contains(text(),'Cronograma por definir')]"));
}
