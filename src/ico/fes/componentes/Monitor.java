/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author CBR19
 */
public class Monitor {
    private String modelo;
    private String marca;
    private int pulgadas;

    public Monitor() {
    }

    public Monitor(String modelo, String marca, int pulgadas) {
        this.modelo = modelo;
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "modelo=" + modelo + ", marca=" + marca + ", pulgadas=" + pulgadas + '}';
    }
    
}
