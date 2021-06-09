package com.lfpu.certificacion.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPaso3Page {

    public static final Target LISTA_PC =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Windows')]");

    public static final Target CAMPO_LISTA_PC =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LISTA_VERSION =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Select a Version')]");

    public static final Target CAMPO_LISTA_VERSION =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LISTA_LENGUAJE =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Select OS language')]");

    public static final Target CAMPO_LISTA_LENGUAJE =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LISTA_MOVIL =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Select Brand')]");

    public static final Target CAMPO_LISTA_MOVIL =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LISTA_MODELO =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Select a Model')]");

    public static final Target CAMPO_LISTA_MODELO =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LISTA_SISTEMA_O =
            Target.the("")
                    .locatedBy("//span[@class = 'ui-select-placeholder text-muted']");

    public static final Target CAMPO_LISTA_SISTEMA_O =
            Target.the("")
                    .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target BTN_PASO_4 =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Next: Last Step')]");

}
