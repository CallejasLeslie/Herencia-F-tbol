/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_futbol;

/**
 *
 * @author Leslie Callejas
 */
public class Masajista extends Seleccion_futbol {

    protected int añosDeExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, int añosDeExperencia) {
        super(id, nombre, apellidos, edad);
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public void darMasaje() {
        System.out.println("Da un masaje");
    }
}
