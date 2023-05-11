package com.UTest.interfazDeUsuario;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target LIST_YOURCOMPUTER = Target.the("listYourComputer").locatedBy("(//*[@class='ui-select-match'])[1]");
    public static final Target SELEC_YOURCOMPUTER = Target.the("selecYourComputer").locatedBy("(//span[@class='ui-select-choices-row-inner'])[2]");
    public static final Target LIST_VERSION = Target.the("listVersion").locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]");
    public static final Target SELEC_VERSION = Target.the("selecVersion").locatedBy("(//span[@class='ui-select-choices-row-inner'])[16]");
    public static final Target LIST_LENGUAGE = Target.the("listLenguage").locatedBy("(//div[@class='ui-select-match'])[3]");
    public static final Target SELEC_LENGUAGE = Target.the("selecLenguage").locatedBy("(//span[@class='ui-select-choices-row-inner'])[38]");
    public static final Target LIST_YOURMOBILE = Target.the("listYourMobile").locatedBy("(//*[@class='ui-select-match'])[4]");
    public static final Target SELEC_YOURMOBILE = Target.the("selecYourMobile").locatedBy("(//*[@class='ui-select-choices-row'])[3]");
    public static final Target LIST_MODEL= Target.the("listModel").locatedBy("(//*[@class='ui-select-match'])[5]");
    public static final Target SELEC_MODEL = Target.the("selecModel").locatedBy("//*[@class='ui-select-match'])[2]");
    public static final Target LIST_OPERTINGSYSTEM= Target.the("listSystem").locatedBy("(//*[@class='ui-select-match'])[6]");
    public static final Target SELEC_OPERTINGSYSTEM = Target.the("selecSystem").locatedBy("//*[@class='ui-select-match'])[1]");
    public static final Target BTN_LASTSTEP= Target.the("BtnLastStep").locatedBy("//*[@class='btn btn-blue pull-right']");

}