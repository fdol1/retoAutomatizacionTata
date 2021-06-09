package com.lfpu.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.lfpu.certificacion.usersinterfaces.RegistroPaso4Page.BTN_FINALIZAR_REGISTRO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizarRegistro implements Task {

    public static FinalizarRegistro deUsuario(){
        return Tasks.instrumented(FinalizarRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_FINALIZAR_REGISTRO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_FINALIZAR_REGISTRO)
        );

    }
}
