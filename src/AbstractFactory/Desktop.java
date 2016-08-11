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
public class Desktop extends Computadora{
    @Override
    public void configurar() {
        System.out.println("configurando Desktop");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando Desktop");
    }

    @Override
    public void instSoft() {
        System.out.println("instalando software de Desktop");
    }

    @Override
    public void embalar() {
        System.out.println("embalando Desktop");
    }
}
