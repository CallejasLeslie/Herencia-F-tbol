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
import java.util.ArrayList;

public class Herencia_futbol {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Seleccion_futbol> equipo = new ArrayList<Seleccion_futbol>();

    public static void main(String[] args) {

        // TODO code application logic here
        Entrenador Piojo = new Entrenador(1, "Miguel", "Herrera", 48, 8);
        Futbolista Peralta = new Futbolista(2, "Oribe", "Peralta", 32, "Delantero");
        Masajista Jaz = new Masajista(3, "Jazsiel", "Hernandez", 28, 5);

        equipo.add(Piojo);
        equipo.add(Peralta);
        equipo.add(Jaz);

        System.out.println("Todos los miembros del equipó deben concentrarse");
        for (Seleccion_futbol equipo : equipo) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -- ");
            equipo.Concentrarse();
        }

        System.out.println("***********************");

        System.out.println("Todos los miembros del equipó deben viajar");
        for (Seleccion_futbol equipo : equipo) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -- ");
            equipo.Viajar();
        }

        System.out.println("***********************");

        System.out.println("Solo el entrenador y futbolista tiene  permitido entrenar:");
        System.out.print(Piojo.getNombre() + " " + Piojo.getApellidos() + " -- ");
        Piojo.dirigirEntrenamiento();
        System.out.print(Peralta.getNombre() + " " + Peralta.getApellidos() + " -> ");
        Peralta.entrenar();

        System.out.println("***********************");

        System.out.println("Solo el entrenador y futbolista tiene  permitido participar en el partido:");
        System.out.print(Piojo.getNombre() + " " + Piojo.getApellidos() + " -- ");
        Piojo.dirigirPartido();
        System.out.print(Peralta.getNombre() + " " + Peralta.getApellidos() + " -> ");
        Peralta.jugarPartido();

        System.out.println("***********************");

        System.out.println("Solo el masajista tiene permitido brindar masajes:");
        System.out.print(Jaz.getNombre()+ " " + Jaz.getApellidos() + " -- ");
        Jaz.darMasaje();
    }
}
