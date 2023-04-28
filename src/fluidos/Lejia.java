/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

/**
 *
 * @author alumno
 */
public class Lejia extends Liquido {

    private Double pureza;
    private final static Double MAX_PUR=1.0;

    public Lejia(Double litros) {
        super(litros, "incoloro");
        this.pureza=MAX_PUR;
    }

    /**
     * Mezcla este liquido con otro
     * @param liq
     * @return mezcla
     */
    @Override
    public Liquido mezclar(Liquido liq) {
        Lejia s = new Lejia(this.litros+liq.litros);
        s.setColor("marron-ambar");
        s.setPureza(this.getLitros()/s.getLitros());
        if (liq instanceof Lejia) {
            setPureza(MAX_PUR);
        }
        return s;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }

}
