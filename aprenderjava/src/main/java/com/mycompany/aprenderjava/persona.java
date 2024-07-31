package com.mycompany.aprenderjava;

public class persona {
    private String nombre;
    private int edad;
    private int num;
   

    public persona() {
    }
   //   @constructor
    public persona(String nombre, int edad, int num) {
        this.nombre = nombre;
        this.edad = edad;
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
