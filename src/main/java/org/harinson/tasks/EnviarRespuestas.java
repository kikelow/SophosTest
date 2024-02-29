package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.harinson.userinterfaces.EmojisPage;

public class EnviarRespuestas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EmojisPage.BOTON_ENVIAR)
        );
        System.out.println("");
    }

    public static EnviarRespuestas aValidar(){
        return Tasks.instrumented(EnviarRespuestas.class);
    }
}
