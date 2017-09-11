package io.github.alexlondon07.clase1_diplomado_android.model;

import java.io.Serializable;

/**
 * Created by alexlondon07 on 9/9/17.
 */

public class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
