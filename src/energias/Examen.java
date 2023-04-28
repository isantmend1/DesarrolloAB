package local.cdm.energias;


/**
 *
 * @author Irene Santos Menduiña
 */
public abstract class Examen implements Accion {

    protected String asignatura;
    protected Integer minutos;
    protected Integer energiaNecesaria;

    public Examen(String asignatura, Integer minutos) {
        this.asignatura = asignatura;
        this.minutos = minutos;
    }
    
    public Examen(){
    }

    @Override
    public abstract void hacer();

    @Override
    public Integer getEnergia() {
        return this.energiaNecesaria;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(Integer energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

}
