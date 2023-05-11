package com.UTest.tasks;

import com.UTest.interfazDeUsuario.Personal;
import com.UTest.iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;

public class PersonalTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Camilo").into(Personal.FIRST_NAME),
                SendKeys.of("Martinez").into(Personal.LAST_NAME),
                SendKeys.of("correofalso@gmail.com").into(Personal.EMAIL),
                SendKeys.of("June").into(Personal.MONTH),
                SendKeys.of("19").into(Personal.DAY),
                SendKeys.of("1995").into(Personal.YEAR),
                Click.on(Personal.NEXT_LOCATION),
                TiempoEspera.unMomento(2)
        );
    }
    public static PersonalTask datospersonales(){
        return Tasks.instrumented(PersonalTask.class);
    }
}
