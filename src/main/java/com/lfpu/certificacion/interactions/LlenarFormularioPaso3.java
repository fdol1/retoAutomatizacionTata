package com.lfpu.certificacion.interactions;

import com.lfpu.certificacion.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.RegistroPaso2Page.TXT_CODIGO_POSTAL;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso3Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioPaso3 implements Interaction {

    private final DatosRegistro datosRegistros;

    public LlenarFormularioPaso3(DatosRegistro datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static LlenarFormularioPaso3 paraElRegistro(DatosRegistro datosRegistros){
        return Tasks.instrumented(LlenarFormularioPaso3.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LISTA_PC,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_PC),
                WaitUntil.the(CAMPO_LISTA_PC.of(datosRegistros.getEquipo()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_PC.of(datosRegistros.getEquipo())),

                WaitUntil.the(LISTA_VERSION,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_VERSION),
                WaitUntil.the(CAMPO_LISTA_VERSION.of(datosRegistros.getVersion()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_VERSION.of(datosRegistros.getVersion())),

                WaitUntil.the(LISTA_LENGUAJE,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_LENGUAJE),
                WaitUntil.the(CAMPO_LISTA_LENGUAJE.of(datosRegistros.getLenguaje()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_LENGUAJE.of(datosRegistros.getLenguaje())),

                WaitUntil.the(LISTA_MOVIL,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_MOVIL),
                WaitUntil.the(CAMPO_LISTA_MOVIL.of(datosRegistros.getMovil()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_MOVIL.of(datosRegistros.getMovil())),

                WaitUntil.the(LISTA_MODELO,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_MODELO),
                WaitUntil.the(CAMPO_LISTA_MODELO.of(datosRegistros.getModelo()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_MODELO.of(datosRegistros.getModelo())),

                WaitUntil.the(LISTA_SISTEMA_O,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LISTA_SISTEMA_O),
                WaitUntil.the(CAMPO_LISTA_SISTEMA_O.of(datosRegistros.getsistemao()),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_LISTA_SISTEMA_O.of(datosRegistros.getsistemao()))

        );

    }
}
