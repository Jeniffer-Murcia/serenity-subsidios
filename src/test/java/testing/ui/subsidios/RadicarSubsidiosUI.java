package testing.ui.subsidios;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadicarSubsidiosUI {

    // Tarjeta de programa
    public static final Target TARJETA_PROGRAMA =
            Target.the("Tarjeta Programa Empleo para la vida")
                    .located(By.cssSelector("div.card:not(.disable) h3"));

    // Estado programa abierto
    public static final Target ESTADO_PROGRAMA_ABIERTO =
            Target.the("Estado del programa abierto")
                    .located(By.cssSelector("div.card:not(.disable) p"));

    // Modal ventana emergente
    public static final Target TITULO_MODAL_VENTANAS_EMERGENTES =
            Target.the("Modal Antes de comenzar")
                    .located(By.id("title"));

    public static final Target BOTON_SALIR_MODAL_VENTANAS_EMERGENTES =
            Target.the("Botón salir del modal")
                    .located(By.id("ok"));

    // Radiobutton de radicar formulario
    public static final Target RADIO_RADICAR_FORMULARIO =
            Target.the("Opción Radicar formulario")
                    .located(By.id("rb-0"));

    // Seleccion documento
    public static final Target SELECCION_TIPO_DOCUMENTO =
            Target.the("Lista desplegable tipo de documento")
                    .located(By.id("docType"));

    // Ingreso documento
    public static final Target INGRESO_NUMERO_DOCUMENTO =
            Target.the("Campo número de identificación")
                    .located(By.id("docNumber"));

    public static final Target INGRESO_DIGITO_VERIFICACION =
            Target.the("Campo dígito de verificación")
                    .located(By.id("digit-ver"));

    // Mes postulación
    public static final Target SELECCION_MES_POSTULACION =
            Target.the("Lista desplegable mes postulación")
                    .located(By.id("date"));

    // Botón continuar
    public static final Target BOTON_CONTINUAR =
            Target.the("Botón continuar")
                    .located(By.id("ingresar"));

}
