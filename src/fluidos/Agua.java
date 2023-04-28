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
public class Agua extends Liquido implements Bebible{

    private Double pureza;
    private final static Double MAX_PUR=1.0;

    public Agua(Double litros) {
        super(litros, "incoloro");
        this.pureza = MAX_PUR;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }

    @Override
    /**
     * Mezcla este liquido con otro
     *
     * @param liq
     * @return mezcla
     */
    public Liquido mezclar(Liquido liq) {
        Agua s = new Agua(this.litros + liq.litros);
        s.setColor("marron-ambar");
        s.setPureza(this.getLitros() / s.getLitros());
        if (liq instanceof Agua) {
            setPureza(MAX_PUR);
        }
        return s;
    }

    @Override
    public Integer getEnergia() {
        double energia = this.getLitros()*30;
        float litros = (float) energia;
        Integer salida = Math.round(litros);
        return salida;
    }

    

}
