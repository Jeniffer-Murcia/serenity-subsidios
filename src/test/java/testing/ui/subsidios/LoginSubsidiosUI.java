package testing.ui.subsidios;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSubsidiosUI {
    //titulo y estado del programa
    public static final Target TITULO_PROGRAMA = Target.the("Titulo del programa").located(By.cssSelector("div.card:not(.disable) h3"));

    public static final Target ESTADO_PROGRAMA_ABIERTO = Target.the("Estado del programa abierto").located(By.cssSelector("div.card:not(.disable) p"));

    //Modal ventanas emergentes
    public static final Target TITULO_MODAL_VENTANAS_EMERGENTES = Target.the("Modal Antes de comenzar").located(By.id("tittle"));

    public static final Target BOTON_SALIR_MODAL_VENTANAS_EMERGENTES = Target.the("Botón salir").located(By.id("ok"));

    //Información del Login
    public static final Target SELECCION_RADICAR_FORMULARIO = Target.the("Selección radicar formulario").located(By.id("rb-0"));

    public static final Target SELECCION_TIPO_DOCUMENTO = Target.the("Inicio de sesión para radicar formulario").located(By.id("docType"));

    public static final Target INGRESO_IDENTIFICACION = Target.the("Ingreso del número de identificación").located(By.id("docNumber"));

    //public static final Target INGRESE_DIGITO_VERIFICACION = Target.the("Ingreso del digito de verificación").located(By.id("digit-ver"));

    public static final Target SELECCION_MES_POSTULACION = Target.the("Seleccionar mes de postulación").located(By.id("date"));

    //Botón continuar
    public static final Target BOTON_CONTINUAR = Target.the("Hacer clic en el botón continuar").located(By.id("ingresar"));

}
