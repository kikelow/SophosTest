package org.harinson.util;

import net.thucydides.model.environment.SystemEnvironmentVariables;

public class EnviromentVariables {

    public static final net.thucydides.model.environment.SystemEnvironmentVariables  ENVIRONMENT_VARIABLES = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String CLAVE = ENVIRONMENT_VARIABLES.getProperty("PASS");
    public static String USUARIO  = ENVIRONMENT_VARIABLES.getProperty("USER");
    public static String TOKEN  = ENVIRONMENT_VARIABLES.getProperty("TOKEN");


}
