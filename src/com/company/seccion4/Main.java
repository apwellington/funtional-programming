package com.company.seccion4;

import com.company.seccion2.interfaces.*;

import java.util.List;
import java.util.Random;

import static com.company.seccion2.Funciones.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> numeros = proveer(31, new Proveedor() {
            @Override
            public Integer obtener() {
                return new Random().nextInt(100);
            }
        });


        System.out.println(numeros);

        List<Integer> filtrados = filtrar(numeros, new Predicado() {
            @Override
            public Boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        System.out.println(filtrados);

        List<Integer> transformados = transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer i) {
                return i * i;
            }
        });
        System.out.println(transformados);


        Consumidor impresor = new Consumidor() {
            @Override
            public void aceptar(Integer i) {
                System.out.println(i);
            }
        };

        //imprime los cuadrados
        List<Integer> actuados = actuar(transformados, impresor);
        consumir(actuados, impresor);

        int total = reducir(actuados, 0, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer total, Integer numero) {
                return total + numero;
            }
        });
        System.out.println(total);
    }

}




