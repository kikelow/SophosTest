package org.harinson.util;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MathUtil {

    private static List<Integer> calcularNumerosMultiplos(Target candidatosMultiplos, Target numeroMultiplicador, Actor actor){
        List<Integer> opcionesMultiplos = new ArrayList<>();
        List<Integer> multiplosElegidos = new ArrayList<>();
        candidatosMultiplos.resolveAllFor(actor).forEach(webElementFacade -> opcionesMultiplos.add(Integer.parseInt(webElementFacade.getText())));
        Collections.sort(opcionesMultiplos);

        String labelEncabezadoMultiplos = numeroMultiplicador.resolveFor(actor).getText();
        int numero = Integer.parseInt(labelEncabezadoMultiplos.substring(labelEncabezadoMultiplos.length()-1));
        int resultado = 0;
        int contador = 1;
        do {
            resultado = numero*contador;
            multiplosElegidos.add(resultado);
            contador++;

        }
        while (resultado < opcionesMultiplos.get(opcionesMultiplos.size()-1));
        return multiplosElegidos;
    }


    public static void seleccionarMultiplos(Target candidatosMultiplos, Target numeroMultiplicador, Actor actor){
        List<Integer> multiplosCalculados = calcularNumerosMultiplos(candidatosMultiplos, numeroMultiplicador, actor);

        List<Integer> opcionesMultiplos = new ArrayList<>();
        candidatosMultiplos.resolveAllFor(actor).forEach(webElementFacade -> opcionesMultiplos.add(Integer.parseInt(webElementFacade.getText())));
        Collections.sort(opcionesMultiplos);

        for (int i = 0; i < opcionesMultiplos.size(); i++) {
            WebElementFacade opcionCkeck = candidatosMultiplos.resolveAllFor(actor).get(i);
            if (multiplosCalculados.contains(Integer.parseInt(opcionCkeck.getText()))) {
                opcionCkeck.click();
            }
        }
    }

}
