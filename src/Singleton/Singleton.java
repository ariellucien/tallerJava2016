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
public class Singleton {
    private Singleton()
    {
        
    }
    public static Singleton getInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }        
        return singleton;        
    }
    
    private static Singleton singleton;
}
