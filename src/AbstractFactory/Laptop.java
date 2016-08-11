/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author administrador1
 */
public class Laptop extends Computadora{

    @Override
    public void configurar() {
        System.out.println("configurando Laptop");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando laptop");
    }

    @Override
    public void instSoft() {
        System.out.println("instalando software de laptop");
    }

    @Override
    public void embalar() {
        System.out.println("embalando laptop");
    }
    
}
