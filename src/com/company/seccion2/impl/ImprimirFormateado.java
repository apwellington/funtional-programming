package com.company.seccion2.impl;

import com.company.seccion2.interfaces.Consumidor;

public class ImprimirFormateado implements Consumidor {
    @Override
    public void aceptar(Integer i) {
        System.out.println(i);
    }
}
