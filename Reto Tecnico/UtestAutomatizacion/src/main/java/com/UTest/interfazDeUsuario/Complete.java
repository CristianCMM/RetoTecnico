package com.UTest.interfazDeUsuario;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target TXT_PASSWORD = Target.the("txtPassword").locatedBy("//*[@id='password']");
    public static final Target TXT_COMFIRMPASSWORD = Target.the("txtConfirmPassword").locatedBy("//*[@id='confirmPassword']");
    public static final Target CHECK_STAYINFORMED = Target.the("checkStayInformed").locatedBy("//*[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");
    public static final Target CHECK_TERMS = Target.the("CheckTerms").locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target CHECK_POLICY = Target.the("CheckPolicy").locatedBy("//*[@class='checkmark signup-consent__checkbox error']");
    public static final Target BTN_COMPLETE = Target.the("  btnComplete").locatedBy("//*[@class='btn btn-blue']");

}
