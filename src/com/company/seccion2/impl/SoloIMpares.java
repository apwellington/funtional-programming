package com.company.seccion2.impl;

import com.company.seccion2.interfaces.Predicado;

public class SoloIMpares implements Predicado {
    @Override
    public Boolean test(Integer integer) {
        return integer % 2 != 0;
    }
}
