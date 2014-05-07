package com.example.calculadores.app;

/**
 * Created by Danny on 02/05/2014.
 */
public class Operacion {
  String o="";
    double x1,y1;
    private double total;

    Operacion(){}

    Operacion(double total){

        setDiv();


    }

    public void setDiv() {
        total = x1 * y1;
        o = "" + total;
    }

}
