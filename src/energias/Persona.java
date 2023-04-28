package local.cdm.energias;


import com.sun.jdi.Value;
import java.util.ArrayList;

/**
 *
 * @author Irene Santos Menduiña
 */
public class Persona implements Energetico {
    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private ArrayList<Accion> tareas;
    
    public Persona(String nombre, Double capacidadVejiga){
        this.nombre=nombre;
        this.capacidadVejiga=capacidadVejiga;
        this.estadoVejiga = null;
        this.energiaActual = 100;
        this.tareas = null;
    }

    public Integer hacerTareas() {
        Integer n = 0;
        for (Accion t : this.tareas) {
            if (this.energiaActual > 0) {
                this.tareas.remove(t);
                this.energiaActual--;
                n++;
            }
        }
        return n;
    }
    
    public Double beber(Bebible b){
        Double litros = b.getLitros();
        float ret=0;
        while(this.estadoVejiga<this.capacidadVejiga && litros >0){
            this.estadoVejiga++;
            ret++;
            litros--;
        }
        this.energiaActual+=Math.round(ret);
        Double Dret = Double.valueOf(ret);
        return Dret;
    }
   
    
    public void addTarea(Accion a){
        this.tareas.add(a);
    }
    
    public void vaciarVejiga() {
        this.estadoVejiga=0.0;

    }

    @Override
    public Integer getEnergia() {
        return this.energiaActual;
    }
    
}
