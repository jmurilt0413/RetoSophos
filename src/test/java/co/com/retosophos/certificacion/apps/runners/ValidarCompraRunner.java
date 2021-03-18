package co.com.retosophos.certificacion.apps.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/saucedemo/validar_compra.feature",
    glue = "co.com.retosophos.certificacion.apps.stepdefinitions")
public class ValidarCompraRunner {}
