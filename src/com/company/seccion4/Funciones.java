package com.company.seccion4;

import com.company.seccion4.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Funciones {

    public static <T> List<T> filtrar(List<T> valores, Predicado<T> predicado){
        List<T> res = new ArrayList<>();
        for (T i: valores) {

            if(predicado.test(i)){
                res.add(i);
            }

        }
        return res;
    }

    public static  <T> List<T> proveer(int size, Proveedor<T> proveedor){
        List<T> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(proveedor.obtener());
        }
        return  res;
    }
    public static  <T> List<T> transformar(List<T> numeros, Funcion<T, R> funcion){
        List<T> res = new ArrayList<>();
        for (T i: numeros) {
            res.add(funcion.aplicar(i));
        }
        return res;
    }

    public static  <T> List<T> actuar(List<T> numeros, Consumidor<T> consumidor){
        for (T i: numeros) {
           consumidor.aceptar(i);
        }
        return numeros;
    }

    public static  <T> void consumir(List<T> numeros, Consumidor<T> consumidor){
        for (T i: numeros) {
            consumidor.aceptar(i);
        }
    }

    public static  <T> T reducir(List<T> numeros, T indentidad, FuncionBinaria funcionBinaria){
        T total = indentidad;
        for (T i: numeros) {
            total = funcionBinaria.aplicar(total, i);
        }
        return total;
    }





}
