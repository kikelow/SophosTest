package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.harinson.userinterfaces.EmojisPage;
import org.harinson.util.EmojisUtil;
import org.harinson.util.MathUtil;

public class IndicarCantidad implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        int catidadEmojis = EmojisUtil.contadorEmojis(EmojisPage.EMOJI_INDICADOR,EmojisPage.LABEL_EMOJIS,actor);
        actor.attemptsTo(
                Enter.keyValues(String.valueOf(catidadEmojis)).into(EmojisPage.INPUT_CANTIDAD_EMOJIS)
        );
    }

    public static IndicarCantidad deEmojis(){
        return Tasks.instrumented(IndicarCantidad.class);
    }

}
