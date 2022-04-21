package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ComprobarInicioSesion;
import tasks.Ingresar;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepdefinition {

    @Cuando("ingreso mis credenciales validas usuario {word} y contrasena {word}")
    public void ingreso_mis_credenciales_validas_usuario_y_contrasena(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(Ingresar.enSaucedemo(usuario,contrasena));
    }

    @Entonces("me permite ingresar al sistema de manera exitosa")
    public void ingresarPagina() {
         OnStage.theActorInTheSpotlight().should(seeThat(ComprobarInicioSesion.enSaucedemo()));

    }


}
