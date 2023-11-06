package com.corenetworks.Modelo;

public class ProductoPerecedero extends Producto{
private String caducidad;

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "caducidad='" + caducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }


    public ProductoPerecedero(String caducidad) {
        this.caducidad = caducidad;
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, String caducidad) {
        super(nombre, cantidad, pvp);
        this.caducidad = caducidad;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
}
