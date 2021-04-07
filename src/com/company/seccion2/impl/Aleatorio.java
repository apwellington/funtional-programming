package com.company.seccion2.impl;

import com.company.seccion2.interfaces.Proveedor;

import java.util.Random;

public class Aleatorio implements Proveedor {
    @Override
    public Integer obtener() {
        return new Random().nextInt(1000);
    }
}
