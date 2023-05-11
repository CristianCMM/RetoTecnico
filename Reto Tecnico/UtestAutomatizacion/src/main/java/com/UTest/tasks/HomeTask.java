package com.UTest.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(com.UTest.interfazDeUsuario.Home.REGISTRO)

        );

    }
    public static HomeTask registrarUsuario(){
        return Tasks.instrumented(HomeTask.class);
    }

}
