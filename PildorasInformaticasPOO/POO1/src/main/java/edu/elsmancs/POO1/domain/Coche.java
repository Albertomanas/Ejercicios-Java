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


    public Coche() { //METODO CONSTRUCTOR (ESTABLECER ESTADO INICIAR OBJETO COCHE)
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

        if (asientos_cuero.equalsIgnoreCase("Si")){
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

    public void setClimatizador(String climatizador) { //SETTER

        if (climatizador.equalsIgnoreCase("Si")) {

            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public String getClimatizador() { //GETTER

        if (climatizador == true){
            return "El coche incorpora climatizador";
        }else {
            return "El coche no lleva climatizador";
        }
    }


   /* public void setPeso_coche() {
        if (getClimatizador() == "sí") {
            this.peso_total = this.peso_total + 50;
        }else {
            getClimatizador() = this.peso_total;
        }
        }
    */
    public int precio_coche(){ //GETTER
        int precio_final = 10000;

        if(asientos_cuero == true){
            precio_final += 2000;
        }
        if (climatizador == true){
            precio_final += 1500;
        }
        return precio_final;
    }

}