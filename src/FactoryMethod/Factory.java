/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author administrador1
 */
public abstract class Factory {
    protected abstract Computadora factoryMethod(String tipoCompu);
    
    public Computadora createCompu(String tipoCompu)
    {
        Computadora c = factoryMethod(tipoCompu);
        c.configurar();
        c.ensamblar();
        c.instSoft();
        c.embalar();
        return c;
    }
}
