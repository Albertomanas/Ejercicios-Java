package edu.elsmancs.POO1;

import edu.elsmancs.POO1.domain.*;

public class App {
    public static void main(String[] args){ //main
        Coche miCoche = new Coche();

        miCoche.establecer_color("Amarillo");
        miCoche.establecer_largo("2000");

        System.out.println(miCoche.dime_datos_generales());
        System.out.println(miCoche.dime_color());

        miCoche.configura_asientos("sí");
        System.out.println(miCoche.dime_asientos());
    }
}
