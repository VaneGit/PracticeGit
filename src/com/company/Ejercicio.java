/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;
import java.util.Scanner;

/**
 *
 * @author MIS DOCUMENTOS
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio ejercicio= new Ejercicio();
        ejercicio.palabra();
    }
    /* EJERCICIO
    Crea una clase con un método main que pida una entrada de teclado y usando un bucle while, el
    método length de la clase String y el método substring de la clase String, muestre cada una de las letras
    que componen la entrada. Por ejemplo si se introduce “ave” debe mostrar:
    Letra 1: a
    Letra 2: v
    Letra 3: e*/
    public String palabra(){
        Scanner entrada = new Scanner(System.in);
        String palabra;
        palabra= entrada.nextLine();
        int tamanoPalabra=0;
        int contador =0;
        while(tamanoPalabra<palabra.length()){          
           tamanoPalabra++;
           System.out.println("letra "+tamanoPalabra+"="+palabra.substring(contador,tamanoPalabra));
           contador++; 
        } 
        return palabra; 
    }
    /*
    Declara dos variables numéricas (con el valor que desees), muestra por
    consola la suma, resta, multiplicación, división y módulo (resto de la división).
    */
    
}
