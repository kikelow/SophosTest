package org.harinson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.harinson.userinterfaces.TokenPage;
import org.harinson.util.PropertiesUtil;

public class SalvarToken implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
         String token = TokenPage.LABEL_TOKEN.resolveFor(actor).getText();
         PropertiesUtil.salvarToken(token);
    }

    public static SalvarToken deCuestionario(){
        return Tasks.instrumented(SalvarToken.class);
    }
}
