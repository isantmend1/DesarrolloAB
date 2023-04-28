package local.cdm.energias;


/**
 *
 * @author Irene Santos Menduiña
 */
public interface Accion extends Energetico {
    
    @Override
    Integer getEnergia();
    
    void hacer();
    
}
