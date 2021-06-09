package com.lfpu.certificacion.interactions;

import com.lfpu.certificacion.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.RegistroPaso1Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso1Page.CAMPO_LISTA_ANIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioPaso1 implements Interaction {

    private final DatosRegistro datosRegistros;

    public LlenarFormularioPaso1(DatosRegistro datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static LlenarFormularioPaso1 paraElRegistro(DatosRegistro datosRegistros){
        return Tasks.instrumented(LlenarFormularioPaso1.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_PRIMER_NOMBRE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datosRegistros.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),

                WaitUntil.the(TXT_SEGUNDO_NOMBRE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datosRegistros.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),

                WaitUntil.the(TXT_CORREO,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datosRegistros.getCorreo()).into(TXT_CORREO),

                WaitUntil.the(LISTA_MES,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_MES),

                WaitUntil.the(CAMPO_LISTA_MES.of(datosRegistros.getMesNacimiento()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_MES.of(datosRegistros.getMesNacimiento())),

                WaitUntil.the(LISTA_DIA,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_DIA),

                WaitUntil.the(CAMPO_LISTA_DIA.of(datosRegistros.getDia()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_DIA.of(datosRegistros.getDia())),

                WaitUntil.the(LISTA_ANIO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_ANIO),

                WaitUntil.the(CAMPO_LISTA_ANIO.of(datosRegistros.getAnio()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_ANIO.of(datosRegistros.getAnio()))
        );

    }
}
