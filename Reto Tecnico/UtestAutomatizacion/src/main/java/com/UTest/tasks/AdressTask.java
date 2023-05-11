package com.UTest.tasks;

import com.UTest.interfazDeUsuario.Adress;
import com.UTest.iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AdressTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TiempoEspera.unMomento(2),
                Click.on(Adress.NEXT_DEVICES)
        );
    }
    public static AdressTask localizacion(){
        return Tasks.instrumented(AdressTask.class);
    }
}
