
/**
 *
 * @author Irene Santos Menduiña
 */
public class ExamenPractico extends Examen {

    public ExamenPractico(String asignatura, Integer minutos) {
        super(asignatura, minutos);
    }

    @Override
    public void hacer() {
        System.out.println("Haciendo el examen práctico de la asignatura " + this.asignatura);
    }
    
    @Override
    public Integer getEnergia(){
        Integer energia=0;
        if(this.minutos%2==0){
            energia++;
        }
        return energia;
    }
    
    
}
