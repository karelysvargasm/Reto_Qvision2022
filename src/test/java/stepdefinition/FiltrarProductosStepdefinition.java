package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ComprobarInicioSesion;
import questions.ValidarFiltro;
import tasks.Filtrar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarProductosStepdefinition {

    @Cuando("realice el ordenamiento de productos por la opcion {string}")
    public void filtrarProductos(String filtro) {
        theActorInTheSpotlight().attemptsTo(Filtrar.enSaucedemo(filtro));
    }

    @Entonces("los productos son ordenados por precios de mayor a menor")
    public void ValidarFiltrado() {
        theActorInTheSpotlight().should(seeThat(ValidarFiltro.enSaucedemo()));

    }


}
