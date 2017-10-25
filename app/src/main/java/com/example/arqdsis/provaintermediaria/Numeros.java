package com.example.arqdsis.provaintermediaria;

/**
 * Created by arqdsis on 25/10/2017.
 * RA:201512177
 * Nome:JoaoLucasLima
 */

public class Numeros {

    public String trataNumeros(String valorFinal){
        valorFinal = valorFinal.toUpperCase();
        valorFinal = valorFinal.replace("ABC","2");
        valorFinal = valorFinal.replace("DEF","3");
        valorFinal = valorFinal.replace("GHI","4");
        valorFinal = valorFinal.replace("JKL","5");
        valorFinal = valorFinal.replace("MNO","6");
        valorFinal = valorFinal.replace("PQRS","7");
        valorFinal = valorFinal.replace("TUV","8");
        valorFinal = valorFinal.replace("WXYZ","9");
        return valorFinal;
    }
}
