package com.lfpu.certificacion.tasks;

import com.lfpu.certificacion.interactions.LlenarFormularioPaso1;
import com.lfpu.certificacion.interactions.LlenarFormularioPaso2;
import com.lfpu.certificacion.interactions.LlenarFormularioPaso3;
import com.lfpu.certificacion.interactions.LlenarFormularioPaso4;
import com.lfpu.certificacion.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.InicioPage.BTN_REGISTRO;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso1Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso2Page.*;
import static com.lfpu.certificacion.usersinterfaces.RegistroPaso3Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDatos implements Task {

    private final DatosRegistro datosRegistros;

    public IngresarDatos(DatosRegistro datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static IngresarDatos paraElRegistroDelUsuario(DatosRegistro datosRegistros){
        return Tasks.instrumented(IngresarDatos.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRO,isVisible()),
                Click.on(BTN_REGISTRO),

                LlenarFormularioPaso1.paraElRegistro(datosRegistros),

                WaitUntil.the(BTN_PASO2,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_PASO2),

                LlenarFormularioPaso2.paraElRegistro(datosRegistros),

                WaitUntil.the(BTN_PASO_3,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_PASO_3),

                LlenarFormularioPaso3.paraElRegistro(datosRegistros),

                WaitUntil.the(BTN_PASO_4,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_PASO_4),

                LlenarFormularioPaso4.paraElRegistro(datosRegistros)
        );

    }
}
