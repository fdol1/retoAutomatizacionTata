package com.lfpu.certificacion.interactions;

import com.lfpu.certificacion.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.RegistroPaso1Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso2Page.TXT_CODIGO_POSTAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioPaso2 implements Interaction {

    private final DatosRegistro datosRegistros;

    public LlenarFormularioPaso2(DatosRegistro datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static LlenarFormularioPaso2 paraElRegistro(DatosRegistro datosRegistros){
        return Tasks.instrumented(LlenarFormularioPaso2.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //WaitUntil.the(TXT_CIUDAD,isVisible()).forNoMoreThan(15).seconds(),
                //Enter.theValue(datosRegistros.getCiudad()).into(TXT_CIUDAD),
                //Hit.the(Keys.ARROW_DOWN).into(TXT_CIUDAD),
                //Hit.the(Keys.ENTER).into(TXT_CIUDAD),

                WaitUntil.the(TXT_CODIGO_POSTAL,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(datosRegistros.getCodigoPostal()).into(TXT_CODIGO_POSTAL)

                //WaitUntil.the(LISTA_PAISES,isVisible()).forNoMoreThan(15).seconds(),
                //Click.on(LISTA_PAISES),
                //Enter.theValue(datosRegistros.getPais()).into(LISTA_PAISES),
        );

    }
}
