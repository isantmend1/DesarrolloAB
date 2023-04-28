/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.energias;

import java.util.ArrayList;
import local.cdm.fluidos.*;

/**
 *
 * @author alumno
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Accion> ac = new ArrayList();
        ac.add(new PartidoFutbol(3));
        ac.add(new ExamenPractico("programacion",30));
        ac.add(new ExamenTest("programacion",50));
        ac.add(new PartidoFutbol(1));
        
        Persona pepe = new Persona("Pepe",20.0);
        
        for(Accion tarea:ac){
            pepe.addTarea(tarea);
        }
        
        for(Accion tarea:)
    }
}
