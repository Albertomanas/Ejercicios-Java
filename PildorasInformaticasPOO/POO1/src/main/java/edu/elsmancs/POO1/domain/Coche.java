package edu.elsmancs.POO1.domain;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;


    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public void establecer_color(String color_coche){  //SETTER Encargado de modificar el valor de una propiedad
        this.color = color_coche;
    }

    public String dime_color(){  //GETTER , es la forma
        return "El color del coche es " + color; //Está obligado a llevar un return
    }

    public void establecer_largo(String largo_coche){
        //largo = largo_coche;
    }

    public String dime_datos_generales(){ //Unico método GETTER
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" +
                ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }

    public void configura_asientos(String asientos_cuero){ //SETTER

        if (asientos_cuero=="sí"){
            this.asientos_cuero = true; // this. hace referencia a la variable de la clase(definida en las propiedades)
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos(){ //GETTER
        if (this.asientos_cuero==true) {
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche tiene asientos de serie";
        }
    }

}