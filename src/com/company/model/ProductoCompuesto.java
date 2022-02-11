package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto {

    private String name;
    private List<ProductoSimple> productoSimples = new ArrayList<>();

    public void addProduct(ProductoSimple p){
        this.productoSimples.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductoSimple> getProductoSimples() {
        return productoSimples;
    }

    public void setProductoSimples(List<ProductoSimple> productoSimples) {
        this.productoSimples = productoSimples;
    }

    @Override
    public String toString() {
        return "ProductoCompuesto{" +
                "name='" + name + '\'' +
                ", productoSimples=" + productoSimples +
                '}';
    }
}
