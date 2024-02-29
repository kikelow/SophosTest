package org.harinson.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.harinson.tasks.*;
import org.openqa.selenium.WebDriver;

public class EmojiStepDefinitions {

    @Managed
    WebDriver driver;

    private Actor kike;


    @After
    private void close() {

    }

    @Given("{string} quiere acceder a el test de emojis del portal evalart")
    public void quiereAccederAElTestDeMatricesDelPortalEvalart(String actor) {
        kike = Actor.named(actor).whoCan(BrowseTheWeb.with(driver));
        kike.wasAbleTo(
                Open.browserOn().thePageNamed("pages.automation")
        );
    }


    @And("ingresa su usuario y clave y realiza click sobre el boton enviar para acceder")
    public void ingresaSuUsuarioYClave() {
        kike.attemptsTo(
                Login.toAccess()
        );
    }


    @When("responda y envie el cuestionario hasta completar los ciclos")
    public void ingresaLaCantidadDeEmojisDeLaImagen() {
        kike.attemptsTo(
                ResponderCuestionario.paraTodosLosCiclos()
        );
    }

    @Then("obtendra el hash para validar el examen")
    public void obtendraElHashParaValidarElExamen() {
        kike.attemptsTo(
                SalvarToken.deCuestionario()
        );
    }
}
