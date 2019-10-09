/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Dto;

/**
 *
 * @author DEV
 */
public class MateriaDto {

    private int id_materia;
    private String nombre;
    private int duracion;

    public MateriaDto() {
    }

    public MateriaDto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
