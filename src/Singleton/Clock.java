/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author administrador1
 */
public class Clock {
    private Clock()
    {    }
    public static Clock getInstance()
    {
        if(singleton == null)
        {
            singleton = new Clock();
        }        
        return singleton;        
    }    
    private static Clock singleton;
    public Date getTime()
    {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println("La fecha y hora son:");
        System.out.println(d.toString());
        return d;
    }                 
}
