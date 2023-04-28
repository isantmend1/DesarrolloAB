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
public class Cola extends Liquido  implements Bebible {

    public boolean cafeina;

    public Cola(Double litros, String color) {
        super(litros, color);
    }

    /**
     * Mezcla dos este liquido con otro
     * @param liq
     * @return mezcla
     * @throws NoSePuedeMezclarException 
     */
    @Override
    public Liquido mezclar(Liquido liq) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    public boolean isCafeina() {
        return cafeina;
    }

    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }

    @Override
    public Integer getEnergia() {
        double energia = this.getLitros()*50;
        float litros = (float) energia;
        Integer salida = Math.round(litros);
        return salida;
    }
    
}
