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
public class Futbolista extends Seleccion_futbol {

    private String posicion;

    public Futbolista(int id, String nombre, String apellidos, int edad, String posicion) {
        super(id, nombre, apellidos, edad);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void jugarPartido() {
        System.out.println("Debes jugar un partido, éxito ;)");
    }

    public void entrenar() {
        System.out.println("Debes entrenar para lograr el éxito ;)");
    }
    
}
