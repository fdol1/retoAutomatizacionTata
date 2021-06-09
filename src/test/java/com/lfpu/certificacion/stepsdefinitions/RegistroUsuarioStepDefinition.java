package com.lfpu.certificacion.stepsdefinitions;

import com.lfpu.certificacion.models.DatosRegistro;
import com.lfpu.certificacion.questions.VerificarMensajeDeRegistro;
import com.lfpu.certificacion.tasks.Abrir;
import com.lfpu.certificacion.tasks.FinalizarRegistro;
import com.lfpu.certificacion.tasks.IngresarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

public class RegistroUsuarioStepDefinition {

    @Before
    public static void asignarElEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El \"([^\"]*)\" ingresa a la pagina$")
    public void elIngresaALaPagina(String actor) {
        theActorCalled(actor).wasAbleTo(Abrir.elPortalUtest());
    }

    @Given("^El usuario ingresa los dastos del registro$")
    public void elUsuarioIngresaLosDastosDelRegistro(List<DatosRegistro> datosRegistrosList) {
        theActorInTheSpotlight().attemptsTo(IngresarDatos.paraElRegistroDelUsuario(datosRegistrosList.get(0)));
    }

    @Given("^acepta el registro$")
    public void aceptaElRegistro() {
        theActorInTheSpotlight().attemptsTo(FinalizarRegistro.deUsuario());
    }

    @Then("^Verifica mensaje: (.*)$")
    public void verificaMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensajeDeRegistro.exitoso(mensaje)));
    }

}
