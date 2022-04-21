package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.FiltrarProductoUserInterface.LIST_FILTRO;

@AllArgsConstructor
public class Filtrar implements Task {
    private final String filtro;


    public static Performable enSaucedemo(String filtro) {
        return Tasks.instrumented(Filtrar.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_FILTRO));

    }
}
