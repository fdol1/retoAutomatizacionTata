package com.lfpu.certificacion.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroExitosoPage {

    public static final Target LBL_REGISTRO_EXITOSO =
            Target.the("")
                    .locatedBy("//h1[contains(text(),'Welcome to the world's largest community of freela')]");

}
