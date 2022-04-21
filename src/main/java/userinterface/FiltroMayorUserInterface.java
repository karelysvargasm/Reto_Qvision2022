package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltroMayorUserInterface {
    public static final Target DIV_PRECIO_MAYOR =
        Target.the("Producto con mayor precio").located(By.className("inventory_item_price"));
}
