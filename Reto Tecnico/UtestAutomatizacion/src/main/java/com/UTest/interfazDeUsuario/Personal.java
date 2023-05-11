package com.UTest.interfazDeUsuario;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRST_NAME = Target.the("txtFirstName").locatedBy("//input[@id='firstName']");
    public static final Target LAST_NAME = Target.the("txtLastName").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL = Target.the("txtEmail").locatedBy("//input[@id='email']");
    public static final Target MONTH = Target.the("txtMonth").locatedBy("//select[@id='birthMonth']");
    public static final Target DAY = Target.the("txtDay").locatedBy("//select[@id='birthDay']");
    public static final Target YEAR = Target.the("txtYear").locatedBy("//select[@id='birthYear']");
    public static final Target NEXT_LOCATION = Target.the("btnNextLocation").locatedBy("//a[@class='btn btn-blue']");
}
