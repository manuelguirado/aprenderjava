/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aprenderjava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author manudev
 */
public class Aprenderjava {

public static List<Integer> condition(Predicate <Integer> predicate, ArrayList<Integer> lista    ) {
    List<Integer> resultado = new ArrayList<Integer>();
    for ( Integer num : lista) {
        if ( predicate.test(num) ) {
            resultado.add(num);

        }
    }
    return resultado;

}

    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("dime numeros  " +  (i+1));
            numeros.add(sc.nextInt());

        }

    Predicate<Integer>espar = num -> num % 2 == 0;
        List<Integer> pares = condition(espar, numeros);

    System.out.println("pares: " + pares);







    }
}
