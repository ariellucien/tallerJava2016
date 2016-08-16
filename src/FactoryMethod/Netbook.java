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
public class Netbook extends Computadora{
    @Override
    public void configurar() {
        System.out.println("configurando netbook");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando netbook");
    }

    @Override
    public void instSoft() {
        System.out.println("instalando software de netbook");
    }

    @Override
    public void embalar() {
        System.out.println("embalando NetBook");
    }
}
