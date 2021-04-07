package com.company.seccion1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //Crear un lista enteros
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        List<Integer> pares = obtenerPares(numeros);
        System.out.println(pares);
        //obtener los cuadrados
        List<Integer> cuadrados = obtenerCuadrasdos(pares);
        System.out.println(cuadrados);
        //imprime los cuadrados
        List<Integer> mostrados = mostrar(cuadrados);
        //obtener suma de los cuadrados
        int total = sumarlista(mostrados);
        System.out.println(total);
    }

    private static int sumarlista(List<Integer> mostrados) {
        int res = 0;
        for (Integer i: mostrados) {
            res += i;
        }
        return res;
    }

    private static List<Integer> mostrar(List<Integer> cuadrados) {
        for (Integer i: cuadrados) {
            System.out.println(i);
        }
        return cuadrados;
    }

    private static List<Integer> obtenerCuadrasdos(List<Integer> pares) {
        List<Integer> cuadrados = new ArrayList<>();
        for (Integer i: pares) {
            cuadrados.add(i * i);
        }
        return cuadrados;
    }

    private static List<Integer> obtenerPares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        for (Integer i: numeros) {
            if(i % 2 == 0){
                pares.add(i);
            }
        }
        return pares;
    }

    private static List<Integer> crearLista() {
        return List.of(0,1,2,3,5,8,13,21,22,24,25,33,55,88,99,56,89,200,10);
    }


}




