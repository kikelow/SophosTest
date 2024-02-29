package org.harinson.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/emojis.feature",
        glue = "org/harinson/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Emoji {
}
