package com.company.seccion2;

import com.company.seccion2.impl.*;

import java.util.ArrayList;
import java.util.List;

import static com.company.seccion2.Funciones.*;

public class Main {

    public static void main(String[] args) {
	    //Crear un lista enteros
        List<Integer> numeros = proveer(31, new Naturales());
        System.out.println(numeros);

        List<Integer> filtrados = filtrar(numeros, new SoloPares());
        System.out.println(filtrados);

        //obtener los cuadrados
        List<Integer> transformados = transformar(filtrados, new AlCubo());
        System.out.println(transformados);

        //imprime los cuadrados
        List<Integer> actuados = actuar(transformados ,new Impresor());

        //consumir
        consumir(actuados, new ImprimirFormateado());

        int total = reducir(actuados, 0, new Sumador());
        System.out.println(total);
    }

}




