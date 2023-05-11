package com.UTest.stepsdefinition;

import com.UTest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class RegistrarUsuarioStep {

    HomeTask RegistrarUsuario;
    PersonalTask PersonalTask;
    AdressTask AdressTask;
    DevicesTask DevicesTask;
    com.UTest.tasks.CompleteTask CompleteTask;
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }
    @Given("^usuario en la home page$")
    public void usuarioEnLaHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }


    @When("^usuario creado con toda la informacion diligenciada$")
    public void usuarioCreadoConTodaLaInformacionDiligenciada() {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.registrarUsuario());
        theActorInTheSpotlight().attemptsTo(PersonalTask.datospersonales());
        theActorInTheSpotlight().attemptsTo(AdressTask.localizacion());
        theActorInTheSpotlight().attemptsTo(DevicesTask.devices());
        theActorInTheSpotlight().attemptsTo(CompleteTask.completar());

    }

    @Then("^usuario ingresa a la web con credenciales$")
    public void usuarioIngresaALaWebConCredenciales() {

    }



}
