package co.com.retosophos.certificacion.apps.runners;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Test;

public class Prueba {

  @Test
  public void consumirPost(){
    Actor Juan = Actor.named("Juan");
    Juan.whoCan(CallAnApi.at("https://reqres.in/"));
    Juan.attemptsTo(
        Post.to("api/users").with(
            requestSpecification -> requestSpecification
            .body("{\n"
                + "    \"name\": \"morpheus\",\n"
                + "    \"job\": \"leader\"\n"
                + "}").log().all()
        ));
    SerenityRest.lastResponse().prettyPrint();
  }

}
