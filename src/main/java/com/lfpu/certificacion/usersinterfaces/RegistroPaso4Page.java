package com.lfpu.certificacion.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPaso4Page {

    public static final Target TXT_CLAVE =
            Target.the("")
                    .locatedBy("//input[@id='password']");

    public static final Target TXT_CONFIRMAR_CLAVE =
            Target.the("")
                    .locatedBy("//input[@id='confirmPassword']");

    public static final Target CKB_INFOMAME =
            Target.the("")
                    .locatedBy("//span[@class = 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");

    public static final Target CKB_ACEPTAR_TERMINIOS =
            Target.the("")
                    .locatedBy("//label[@class = 'input-check-box signup-consent']");

    public static final Target CKB_ACEPTAR_POLITICAS_DE_PRIVACIDAD =
            Target.the("")
                    .locatedBy("//span[@class = 'checkmark signup-consent__checkbox error']");

    public static final Target BTN_FINALIZAR_REGISTRO =
            Target.the("")
                    .locatedBy("//a[@id='laddaBtn']");
}
