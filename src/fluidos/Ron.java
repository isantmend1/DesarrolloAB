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
public class Ron extends Liquido implements Graduable,Bebible {

    private Double grados;

    public Ron(Double litros, Double grados) {
        super(litros, "ambar");
        this.grados=grados;
    }

    /**
     * Devuelve la mezcla que solo puede ser con cola o agua
     * @param liq
     * @return mezcla
     * @throws NoSePuedeMezclarException 
     */
    public Copa mezclar(Liquido liq) throws NoSePuedeMezclarException{
        Copa s;
        if(liq instanceof Cola || liq instanceof Agua){
            s=new Copa(this, liq);
        }
        else{
            throw new NoSePuedeMezclarException();
        }
        return s;
    }

    @Override
    public Double getGrados() {
        return this.grados;
    }

    @Override
    public Integer getEnergia() {
        double energia = -100*this.getGrados()/this.getLitros();
        float litros = (float) energia;
        Integer salida = Math.round(litros);
        return salida;
    }
    
}
