package com.company.seccion2.impl;

import com.company.seccion2.interfaces.Funcion;

public class AlCubo implements Funcion {
    @Override
    public Integer aplicar(Integer i) {
        return i * i * i;
    }
}
