/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrador1
 */
public class Ethread extends Thread {
    private int id;

    public Ethread(int id) {
        this.id = id;
    }        
    
    @Override
    public void run() 
    {
        Random r = new Random();
        System.out.println("Soy el hilo: "+ id + " y mi prioridad es: " + this.getPriority());        
        try 
        {
            System.out.println("Hilo: " + id + " está esperando");            
            int tiempo = r.nextInt(29000)+1000;            
            System.out.println("tiempo: " + tiempo);
            sleep(tiempo);
            System.out.println("hilo: "+ id + " finalizó");
        } catch (InterruptedException ex) {            
        }
    }
    public static void main(String[] args) throws InterruptedException 
    {
        
        Thread t100 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("no soy demonio");
                try {
                    sleep(5000);
                    System.out.println("finaliza");
                } catch (InterruptedException ex) {                    
                }
            }
        });
        t100.start();
        
        Thread t2 = new Ethread(2);
        t2.start();
        t2.join();
        (new Ethread(3)).start();
        (new Ethread(4)).start();
        
        
        Thread t1 = new Ethread(1);
        t1.setPriority(MAX_PRIORITY);
        t1.setDaemon(true);
        t1.start(); 
        
        
    }
}
