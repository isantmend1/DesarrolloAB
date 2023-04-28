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
public abstract class Liquido{

    protected Double litros;
    protected String color;

    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }

    public void Liquido(Double num, String nom) {

    }

    public void incrementar(Double num) {

    }

    public abstract Liquido mezclar(Liquido liq) throws NoSePuedeMezclarException;

    @Override
    public String toString() {
        return "Liquido{" + "litros=" + litros + ", color=" + color + '}';
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static void main(String[] args) {
        Agua a = new Agua(20.0);
        a.getEnergia();
    }

}

