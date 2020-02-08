package edu.elsmancs.POO1;

import edu.elsmancs.POO1.domain.*;

import javax.swing.*;

public class App {
    public static void main(String[] args){ //main
        Coche miCoche = new Coche();

        miCoche.establecer_color(JOptionPane.showInputDialog("Introduce color"));
        miCoche.establecer_largo(JOptionPane.showInputDialog("Introduce longitud"));

        System.out.println(miCoche.dime_datos_generales());
        System.out.println(miCoche.dime_color());

        miCoche.configura_asientos(JOptionPane.showInputDialog("¿Lleva asientos de cuero?"));
        System.out.println(miCoche.dime_asientos());

        miCoche.setClimatizador(JOptionPane.showInputDialog("¿Lleva climatizador?"));
        System.out.println(miCoche.getClimatizador());

        System.out.println("El precio final del coche es: " + miCoche.precio_coche());
    }
}
