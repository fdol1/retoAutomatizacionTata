package com.lfpu.certificacion.interactions;

import com.lfpu.certificacion.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.RegistroPaso3Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso4Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso4Page.BTN_FINALIZAR_REGISTRO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioPaso4 implements Interaction {

    private final DatosRegistro datosRegistros;

    public LlenarFormularioPaso4(DatosRegistro datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static LlenarFormularioPaso4 paraElRegistro(DatosRegistro datosRegistros){
        return Tasks.instrumented(LlenarFormularioPaso4.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_CLAVE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datosRegistros.getClave()).into(TXT_CLAVE),

                WaitUntil.the(TXT_CONFIRMAR_CLAVE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datosRegistros.getClave()).into(TXT_CONFIRMAR_CLAVE),

                WaitUntil.the(CKB_INFOMAME,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CKB_INFOMAME),

                WaitUntil.the(CKB_ACEPTAR_TERMINIOS,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CKB_ACEPTAR_TERMINIOS),

                WaitUntil.the(CKB_ACEPTAR_POLITICAS_DE_PRIVACIDAD,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CKB_ACEPTAR_POLITICAS_DE_PRIVACIDAD)
        );

    }
}
