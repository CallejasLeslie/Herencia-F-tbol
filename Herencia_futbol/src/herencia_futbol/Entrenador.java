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
public class Entrenador extends Seleccion_futbol {

    protected int numEquiposDirigidos;

    public Entrenador(int id, String nombre, String apellidos, int edad, int numEquiposDirigidos) {
        super(id, nombre, apellidos, edad);
        this.numEquiposDirigidos = numEquiposDirigidos;
    }

    public void setNumEquiposDirigidos(int numEquiposDirigidos) {
        this.numEquiposDirigidos = numEquiposDirigidos;
    }

    public int getNumEquiposDirigidos() {
        return numEquiposDirigidos;
    }

    public void dirigirPartido() {
        System.out.println("Dirige a tus pupilos en un partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirige a tus pupilos en un entrenamiento");
    }
}
