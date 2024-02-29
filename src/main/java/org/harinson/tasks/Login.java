package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.harinson.userinterfaces.LoginPage;
import org.harinson.userinterfaces.EmojisPage;
import org.harinson.util.EmojisUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.harinson.util.EnviromentVariables.CLAVE;
import static org.harinson.util.EnviromentVariables.USUARIO;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(USUARIO).into(LoginPage.INPUT_USUARIO),
                Enter.keyValues(CLAVE).into(LoginPage.INPUT_CLAVE),
                Click.on(LoginPage.BOTON_ENVIAR).afterWaitingUntilEnabled()
        );
        actor.attemptsTo(
                WaitUntil.the(EmojisPage.LABEL_EMOJIS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
        EmojisUtil.contadorEmojis(EmojisPage.EMOJI_INDICADOR, EmojisPage.LABEL_EMOJIS,actor);
    }
    public static Login toAccess(){
        return Tasks.instrumented(Login.class);
    }
}
