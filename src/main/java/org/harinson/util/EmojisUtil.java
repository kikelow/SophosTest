package org.harinson.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EmojisUtil {

    public static int[] of (String coordenadas){
        String[] paresCoordenadas = coordenadas.replace("(","").replace(")","").split("\\*");
        int sumaX = 0;
        int sumaY = 0;
        for (String paresCoordenada : paresCoordenadas) {
            sumaX += Integer.parseInt(paresCoordenada.split(",")[0]);
            sumaY += Integer.parseInt(paresCoordenada.split(",")[1]);
        }
        return new int[]{sumaX, sumaY};
    }

    public static int contadorEmojis(Target comparador, Target muestra, Actor actor){

        String comparadorC = Character.toString(comparador.resolveFor(actor).getText().split(StringUtils.SPACE)[2].toCharArray()[0]).concat(Character.toString(comparador.resolveFor(actor).getText().split(StringUtils.SPACE)[2].toCharArray()[1]));
        String muestraC = muestra.resolveFor(actor).getText();
        int contador = 0;
        int conteoEmojis = 0;
        List<Character> aa = new ArrayList<>();
        for (char c : muestraC.toCharArray()) {
                contador+=1;
                aa.add(c);
            if (contador % 2 == 0) {
                String union = Character.toString(aa.get(0)).concat(Character.toString(aa.get(aa.size()-1)));
                aa.remove(0);
                aa.remove(aa.size()-1);
                if (union.equals(comparadorC)) {
                    conteoEmojis+=1;
                }
            }

        }
        return conteoEmojis;
    }
}
