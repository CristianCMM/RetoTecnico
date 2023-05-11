package com.UTest.tasks;

import com.UTest.interfazDeUsuario.Complete;
import com.UTest.interfazDeUsuario.Devices;
import com.UTest.interfazDeUsuario.Personal;
import com.UTest.iteracciones.TiempoEspera;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DevicesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Devices.LIST_YOURCOMPUTER),
                Click.on(Devices.SELEC_YOURCOMPUTER),
                Click.on(Devices.LIST_VERSION),
                Click.on(Devices.SELEC_VERSION),
                Click.on(Devices.LIST_LENGUAGE),
                Click.on(Devices.SELEC_LENGUAGE),
                Click.on(Devices.LIST_YOURMOBILE),
                Click.on(Devices.SELEC_YOURMOBILE),
                Click.on(Devices.LIST_MODEL),
                TiempoEspera.unMomento(2),
                WaitUntil.the(Devices.SELEC_MODEL, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Devices.SELEC_MODEL),
                Click.on(Devices.LIST_OPERTINGSYSTEM),
                WaitUntil.the(Devices.SELEC_OPERTINGSYSTEM, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Devices.SELEC_OPERTINGSYSTEM),
                TiempoEspera.unMomento(2),
                Click.on(Devices.BTN_LASTSTEP)
        );



    }

    public static DevicesTask devices() {
        return Tasks.instrumented(DevicesTask.class);
    }
}