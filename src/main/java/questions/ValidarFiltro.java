package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.FiltroMayorUserInterface;

import static userinterface.FiltroMayorUserInterface.DIV_PRECIO_MAYOR;


public class ValidarFiltro implements Question<Boolean> {

    public static ValidarFiltro enSaucedemo(){
        return new ValidarFiltro();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return DIV_PRECIO_MAYOR.resolveFor(actor).isPresent();

    }
}
