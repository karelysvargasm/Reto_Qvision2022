package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.IngresarUserInterface;
import org.openqa.selenium.Keys;

import static userinterface.IngresarUserInterface.LBL_USUARIO;
import static userinterface.IngresarUserInterface.LBL_CONTRASENA;
import static userinterface.IngresarUserInterface.BTN_LOGIN;

@AllArgsConstructor
public class Ingresar implements Task {
    private final String usuario;
    private final String contrasena;

    public static Performable enSaucedemo(String usuario, String contrasena) {
        return Tasks.instrumented(Ingresar.class, usuario, contrasena);
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(LBL_USUARIO));
        actor.attemptsTo(Enter.theValue(contrasena).into(LBL_CONTRASENA));
        actor.attemptsTo(Click.on(BTN_LOGIN));


    }
}
