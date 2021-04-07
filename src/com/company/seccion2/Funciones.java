package com.company.seccion2;

import com.company.seccion2.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Funciones {

    public static List<Integer> filtrar(List<Integer> valores,Predicado predicado){
        List<Integer> res = new ArrayList<>();
        for (Integer i: valores) {

            if(predicado.test(i)){
                res.add(i);
            }

        }
        return res;
    }

    public static List<Integer> proveer(int size, Proveedor proveedor){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(proveedor.obtener());
        }
        return  res;
    }
    public static List<Integer> transformar(List<Integer> numeros, Funcion funcion){
        List<Integer> res = new ArrayList<>();
        for (Integer i: numeros) {
            res.add(funcion.aplicar(i));
        }
        return res;
    }

    public static List<Integer> actuar(List<Integer> numeros, Consumidor consumidor){
        for (Integer i: numeros) {
           consumidor.aceptar(i);
        }
        return numeros;
    }

    public static void consumir(List<Integer> numeros, Consumidor consumidor){
        for (Integer i: numeros) {
            consumidor.aceptar(i);
        }
    }

    public static Integer reducir(List<Integer> numeros, Integer indentidad, FuncionBinaria funcionBinaria){

        int total = indentidad;
        for (Integer i: numeros) {
            total = funcionBinaria.aplicar(total, i);
        }
        return total;
    }





}
