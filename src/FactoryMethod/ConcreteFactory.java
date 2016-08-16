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
public class ConcreteFactory extends Factory{

    @Override
    protected Computadora factoryMethod(String tipoCompu) {
        Computadora c;
        switch (tipoCompu)
        {
                case "laptop":
                    c = new Laptop();
                    break;
                case "netbook":
                    c = new Netbook();
                    break;
                case "desktop":
                    c = new Desktop();
                    break;
                default :
                    c = null;
                    break;
        }               
        return c;
    }
}
