package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoPaginaInicalUserInterface {

    public static final Target DIV_SAUCEDEMO = Target.the("Visible el logo de SWAGLABS ")
            .located(By.xpath("//div[@class='app_logo']"));


}
