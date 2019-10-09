/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Controller;

import a.com.Dto.EstudianteDto;
import a.com.Dto.MateriaDto;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author DEV
 */
@Named(value = "controllerEstudiante")
@RequestScoped
public class ControllerEstudiante {

    private int cedula;
    private String nombre;

    public void registrarEstudiante() {
        System.out.println("Entre al metodo registrarEstudiante");

    }

    public ControllerEstudiante() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
