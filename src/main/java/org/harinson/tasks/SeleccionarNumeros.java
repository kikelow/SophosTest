package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.harinson.userinterfaces.EmojisPage;
import org.harinson.util.MathUtil;

public class SeleccionarNumeros implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        MathUtil.seleccionarMultiplos(EmojisPage.LIST_OPCIONES_NUMEROS_MULTIPLOS, EmojisPage.LABEL_ENCABEZADO_MULTIPLOS, actor);
    }

    public static SeleccionarNumeros multipos() {
        return Tasks.instrumented(SeleccionarNumeros.class);
    }
}
