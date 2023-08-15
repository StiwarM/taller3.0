package com.example.taller20;

public class Operacion {
    public String suma(String numero1, String numero2) {
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String resta(String numero1, String numero2) {
        int resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String multiplicar(String numero1, String numero2) {
        int resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String dividir(String numero1, String numero2) {
        int resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String Alcuadrado(String numero1, String numero2) {
        int resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2) * 2;
        return String.valueOf(resultado);
    }
}