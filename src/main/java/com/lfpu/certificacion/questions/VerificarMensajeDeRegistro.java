package com.lfpu.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static com.lfpu.certificacion.usersinterfaces.RegistroExitosoPage.LBL_REGISTRO_EXITOSO;

public class VerificarMensajeDeRegistro implements Question {

    private final String mensaje;

    public VerificarMensajeDeRegistro(String mensaje) {
        this.mensaje = mensaje;
    }

    public static VerificarMensajeDeRegistro exitoso(String mensaje){
        return new VerificarMensajeDeRegistro(mensaje);
    }


    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_REGISTRO_EXITOSO,isVisible()).forNoMoreThan(10).seconds()

        );

        return mensaje.equals(Text.of(LBL_REGISTRO_EXITOSO).viewedBy(actor).asString());
    }
}
