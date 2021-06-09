package com.lfpu.certificacion.tasks;

import com.lfpu.certificacion.usersinterfaces.InicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private InicioPage inicioPage;

    public static Abrir elPortalUtest(){
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(inicioPage)
        );
    }
}
