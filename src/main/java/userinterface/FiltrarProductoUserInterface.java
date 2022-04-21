package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltrarProductoUserInterface {
    public static final Target LIST_FILTRO =
            Target.the("Filtar productos").located(By.xpath("//option[contains(text(),'Price (high to low)')]"));
}
