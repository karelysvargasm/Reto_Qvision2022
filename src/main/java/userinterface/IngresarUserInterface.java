package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarUserInterface  {

    public static final Target LBL_USUARIO =
            Target.the("Ingresar usuario").located(By.id("user-name"));
    public static final Target LBL_CONTRASENA =
            Target.the("Ingresar contraseña").located(By.id("password"));
    public static final Target BTN_LOGIN =
            Target.the("Click boton").located(By.id("login-button"));

}
