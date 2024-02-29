package org.harinson.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmojisPage {

    public static final Target EMOJI_INDICADOR = Target.the("").located(By.xpath("//p[contains(text(),'cuantos')]"));

    public static final Target LABEL_EMOJIS = Target.the("").located(By.xpath("//p[contains(text(),'cuantos')]/following-sibling::p"));

    public static final Target INPUT_CANTIDAD_EMOJIS = Target.the("").located(By.xpath("//input[@name='number']"));

    public static final Target BOTON_ENVIAR = Target.the("").located(By.xpath("//button[@type='submit']"));

    public static final Target LIST_OPCIONES_NUMEROS_MULTIPLOS = Target.the("").located(By.xpath("//input[@name='checkbox']/parent::label"));

    public static final Target LABEL_ENCABEZADO_MULTIPLOS = Target.the("").located(By.xpath("//input[@name='checkbox']/parent::label/parent::div/preceding-sibling::p"));

    public static final Target LABEL_CICLOS_REALIZADOS = Target.the("").located(By.xpath("//p[contains(text(),'ciclo')]"));

}
