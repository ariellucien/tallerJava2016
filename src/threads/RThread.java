/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author administrador1
 */
public class RThread implements Runnable{
    private int id;
    
    public RThread(int id) {
        this.id = id;
    }
    
    
    @Override
    public void run() {
        System.out.println("Soy el hilo: " + id);
    }
    
    public static void main(String[] args) {
        RThread t1 = new RThread(1); //crear una acción a realiza 
        RThread t2 = new RThread(2); //crear una acción a realiza 
        RThread t3 = new RThread(3); //crear una acción a realiza 
        RThread t4 = new RThread(4); //crear una acción a realiza 
        
        Thread h1 = new Thread(t1); //creación de cada hilo
        Thread h2 = new Thread(t2);
        Thread h3 = new Thread(t3);
        Thread h4 = new Thread(t4);                        
        
        h1.start();  //ejecución de cada hilo
        h2.start();
        h3.start();
        h4.start();
    }
}
