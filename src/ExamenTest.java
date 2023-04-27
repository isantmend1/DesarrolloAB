
/**
 *
 * @author Irene Santos Menduiña
 */
public class ExamenTest extends Examen {

    private Integer numPreguntas;
    private Boolean resta;

    public ExamenTest(String asignatura, Integer minutos) {
        super(asignatura, minutos);
    }

    public ExamenTest(String asignatura, Integer numPreguntas, Boolean resta) {
        super.asignatura=asignatura;
        this.numPreguntas = numPreguntas;
        this.resta = resta;
    }

    @Override
    public void hacer() {
        System.out.println("Haciendo pregunta " + this.numPreguntas + " del examen de la asignatura " + this.asignatura);
    }

    @Override
    public Integer getEnergia() {
        Integer energia = 0;
        if (this.resta == false) {
            if (this.numPreguntas % 4 == 0) {
                energia++;
            }
        }
        if (this.numPreguntas % 2 == 0) {
            energia++;
        }
        return energia;
    }

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(Integer numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }

    public void setResta(Boolean resta) {
        this.resta = resta;
    }

}
