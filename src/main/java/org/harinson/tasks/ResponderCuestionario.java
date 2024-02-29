package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.harinson.userinterfaces.EmojisPage;

public class ResponderCuestionario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
      //  String labelCiclosRealizados = EmojisPage.LABEL_CICLOS_REALIZADOS.resolveFor(actor).getText();
    //    int ciclosTotales = Integer.parseInt(labelCiclosRealizados.substring(labelCiclosRealizados.length()-1));
        for (int i = 0; i < 10; i++) {
            actor.attemptsTo(
                    IndicarCantidad.deEmojis(),
                    SeleccionarNumeros.multipos(),
                    EnviarRespuestas.aValidar()
            );
        }
    }

    public static ResponderCuestionario paraTodosLosCiclos(){
        return Tasks.instrumented(ResponderCuestionario.class);
    }
}
