/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.comp;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author CBR19
 */
public class Computadora {

    private String marca;
    private int modelo;
    private Mouse mouse;
    private Monitor monitor;
    private Cpu cpu;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, int modelo, Mouse mouse, Monitor monitor, Cpu cpu, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", mouse=" + mouse + ", monitor=" + monitor + ", cpu=" + cpu + ", teclado=" + teclado + '}';
    }
    
}
  