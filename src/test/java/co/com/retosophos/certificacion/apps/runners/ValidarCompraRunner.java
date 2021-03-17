package co.com.retosophos.certificacion.apps.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/saucedemo/validar_compra.feature",
    glue = "co.com.retosophos.certificacion.apps.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)
public class ValidarCompraRunner { }
