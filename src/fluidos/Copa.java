/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

import local.cdm.energias.Bebible;

/**
 *
 * @author alumno
 */
public class Copa extends Liquido implements Graduable,Bebible{

    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable gra, Liquido liq)throws NoSePuedeMezclarException {
        super(liq.getLitros(), liq.getColor());
        if(gra instanceof Bebible && liq instanceof Bebible){
        Liquido alc = (Liquido) gra;
        setLitros(alc.getLitros() + liq.getLitros());
        }else{
            throw new NoSePuedeMezclarException();
        }
        this.alcohol = gra;
        this.mezcla = liq;
    }

    @Override
    public Liquido mezclar(Liquido liquido) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    
    @Override
    public Double getGrados() {
        Liquido alc = (Liquido) alcohol;
        if (this.alcohol instanceof Ron) {
            alc = (Ron) alcohol;
        } else if (this.alcohol instanceof Vodka) {
            alc = (Vodka) alcohol;
        }
        Double calcu = alcohol.getGrados() * alc.getLitros() / this.litros;
        return calcu;
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public local.cdm.fluidos.Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(local.cdm.fluidos.Liquido mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public Integer getEnergia() {
        Bebible mezc = (Bebible)mezcla;
        Bebible alc = (Bebible)alcohol;
        return mezc.getEnergia()+alc.getEnergia();
    }

}
