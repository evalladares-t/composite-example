package com.company;

import com.company.model.ProductoCompuesto;
import com.company.model.ProductoSimple;

public class Main {

    public static void main(String[] args) {
        ProductoSimple productoSimple = new ProductoSimple();
        productoSimple.setName("Simple");
        productoSimple.setAmount((float) 14.7);

        ProductoSimple productoSimple2 = new ProductoSimple();
        productoSimple2.setName("Simple");
        productoSimple2.setAmount((float) 14.7);

        ProductoCompuesto productoCompuesto = new ProductoCompuesto();
        productoCompuesto.setName("Compuesto");
        productoCompuesto.addProduct(productoSimple);
        productoCompuesto.addProduct(productoSimple2);

        System.out.println(productoCompuesto);
    }
}
