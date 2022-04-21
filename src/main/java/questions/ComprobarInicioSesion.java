package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SaucedemoPaginaInicalUserInterface;

import static userinterface.SaucedemoPaginaInicalUserInterface.*;


public class ComprobarInicioSesion implements Question<Boolean> {

    public static ComprobarInicioSesion enSaucedemo(){
        return new ComprobarInicioSesion();
}
    @Override
    public Boolean answeredBy(Actor actor) {
        return DIV_SAUCEDEMO.resolveFor(actor).isPresent();

    }

}