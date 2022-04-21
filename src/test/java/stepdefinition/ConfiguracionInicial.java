package stepdefinition;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;
import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConfiguracionInicial {
    @Before
    public void configurarActor() {
        setTheStage(new OnlineCast());
        theActorCalled("Karelys");
    }

    @Dado("que {word} esta en la pagina {word}")
    public void que_Karelys_esta_en_la_pagina_saucedemo(String name, String nombrePagina) {
        theActorCalled(name).wasAbleTo(Abrir.pagina(nombrePagina));
    }

}
