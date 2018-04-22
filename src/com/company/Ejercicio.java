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
        //ejercicio.palabra();
        //ejercicio.operaciones();
        //ejercicio.diferenciaValores();
        ejercicio.nombres();
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
    public void operaciones(){
        Scanner entrada = new Scanner(System.in);
        int primero;
        int segundo;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int modulo;
        System.out.println("introducir el primero");
        primero = entrada.nextInt();
        System.out.println("introducir el segundo");
        segundo = entrada.nextInt();
        suma = primero+segundo;
        resta = primero-segundo;
        multiplicacion = primero*segundo;
        division = primero/segundo;
        modulo = primero%segundo;
        System.out.println("la suma de:"+primero+"+"+segundo+"="+suma); 
        System.out.println("la resta de:"+primero+"-"+segundo+"="+resta); 
        System.out.println("la multiplicacion de:"+primero+"*"+segundo+"="+multiplicacion); 
        System.out.println("la division de:"+primero+"/"+segundo+"="+division); 
        System.out.println("la modulo de:"+primero+"%"+segundo+"="+modulo);   
    }
    /*
    Declara 2 variables numéricas (con el valor que desees), he indica cual
    es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los 
    valores para comprobar que funciona.
    */
    public void diferenciaValores(){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        numero1= entrada.nextInt();
        numero2= entrada.nextInt();
        if(numero1>=numero2){
            if(numero1==numero2){
            System.out.println("los numeron son iguales");
            }else{
            System.out.println("el numero mayor es"+numero1);
            }
        }else{
             System.out.println("el numero mayor es"+numero2);
        }
    }
    /*
    Declara un String que contenga tu nombre, después muestra un mensaje
    de bienvenida por consola. Por ejemplo: si introduzco “Fernando”,
    me aparezca “Bienvenido Fernando”.
    */
    public void nombres(){
        Scanner entrada= new Scanner(System.in);
        String nombre;
        nombre= entrada.nextLine();
        System.out.println("Bienvenido "+nombre);
    }
}
