package com.company.seccion2.impl;

import com.company.seccion2.interfaces.Proveedor;

import java.util.Random;

public class Naturales implements Proveedor {

    private static int next = 0;
    @Override
    public Integer obtener() {
        return next++;
    }
}
