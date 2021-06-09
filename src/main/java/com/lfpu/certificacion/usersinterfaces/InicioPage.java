package com.lfpu.certificacion.usersinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InicioPage extends PageObject {

    public static final Target BTN_REGISTRO =
            Target.the("Botón para ingresar al menú de registro")
                    .locatedBy("//li/a[@class = 'unauthenticated-nav-bar__sign-up']");
}
