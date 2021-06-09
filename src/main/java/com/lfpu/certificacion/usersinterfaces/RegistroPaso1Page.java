package com.lfpu.certificacion.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPaso1Page {

    public static final Target TXT_PRIMER_NOMBRE =
            Target.the("")
                    .locatedBy("//input[@id='firstName']");

    public static final Target TXT_SEGUNDO_NOMBRE =
            Target.the("")
                    .locatedBy("//input[@id='lastName']");

    public static final Target TXT_CORREO =
            Target.the("")
                    .locatedBy("//input[@id='email']");

    public static final Target LISTA_MES =
            Target.the("")
                    .locatedBy("//select[@id='birthMonth']");

    public static final Target CAMPO_LISTA_MES =
            Target.the("")
                    .locatedBy("//select[@id='birthMonth']/option[contains(text(),'{0}')]");

    public static final Target LISTA_DIA =
            Target.the("")
                    .locatedBy("//select[@id='birthDay']");

    public static final Target CAMPO_LISTA_DIA =
            Target.the("")
                    .locatedBy("//select[@id='birthDay']/option[contains(text(),'{0}')]");

    public static final Target LISTA_ANIO =
            Target.the("")
                    .locatedBy("//select[@id='birthYear']");

    public static final Target CAMPO_LISTA_ANIO =
            Target.the("")
                    .locatedBy("//select[@id='birthYear']/option[contains(text(),'{0}')]");

    public static final Target BTN_PASO2 =
            Target.the("")
                    .locatedBy("//span[contains(text(),'Next: Location')]");
}