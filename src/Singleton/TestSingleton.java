/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author administrador1
 */
public class TestSingleton {    
    public static void main(String[] args) {
        Singleton s1, s2, s3;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();        
        s3 = Singleton.getInstance();
        if(s1 == s3)
        {
            System.out.println("si");
        }
        else
            System.out.println("nop");
        
        Clock c, d, e;
        c = Clock.getInstance();
        d = Clock.getInstance();
        e = Clock.getInstance();        
        c.getTime();
        d.getTime();
        e.getTime();
        
    }
}
