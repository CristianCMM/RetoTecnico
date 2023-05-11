package com.UTest.tasks;

import com.UTest.interfazDeUsuario.Complete;
import com.UTest.iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class CompleteTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Periferia123*").into(Complete.TXT_PASSWORD),
                SendKeys.of("Periferia123*").into(Complete.TXT_COMFIRMPASSWORD),
                Click.on(Complete.CHECK_STAYINFORMED),
                Click.on(Complete.CHECK_TERMS),
                Click.on(Complete.CHECK_POLICY),
                Click.on(Complete.BTN_COMPLETE),
                TiempoEspera.unMomento(2)
        );
    }
    public static CompleteTask completar() {
        return Tasks.instrumented(CompleteTask.class);
    }
}
