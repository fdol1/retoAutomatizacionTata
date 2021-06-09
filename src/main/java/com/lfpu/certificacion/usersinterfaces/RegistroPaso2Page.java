package com.lfpu.certificacion.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPaso2Page {

    public static final Target TXT_CIUDAD =
            Target.the("")
                    .locatedBy("//input[@id='city']");

    public static final Target TXT_CODIGO_POSTAL =
            Target.the("")
                    .locatedBy("//input[@id='zip']");

    public static final Target LISTA_PAISES =
            Target.the("")
                    .locatedBy("//span[@class = 'ui-select-match-text pull-left']");

    public static final Target CAMPO_LISTA_PAISES =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target BTN_PASO_3 =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Next: Devices')]");
}
