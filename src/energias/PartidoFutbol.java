package local.cdm.energias;


import java.util.Objects;


/**
 *
 * @author Irene Santos Menduiña
 */
public class PartidoFutbol implements Accion{
    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;
    
    public PartidoFutbol(Integer categoria){
        if(categoria < 1 || categoria > 7){
            this.categoria=1;
        } 
        this.categoria=categoria;
        this.prorroga = null;
        this.penaltis= null;
        this.energiaNecesaria = getEnergia();
    }

    
    @Override
    public Integer getEnergia(){
        Integer energia = this.energiaNecesaria*40;
        if(this.prorroga != null){
           energia += Math.round(energia*0.15f);
        }
        if(this.penaltis != null){
           energia += Math.round(energia*0.05f);
        }
        return energia;
    }
    
    public Boolean getProrroga() {
        return prorroga;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Boolean penaltis) {
        this.penaltis = penaltis;
    }

    @Override
    public void hacer() {
        System.out.println("Jugando partido de categoria "+ this.categoria + " Prorroga: " + this.prorroga + " Penaltis: " + this.penaltis);
    }
    
    
    
    
}
