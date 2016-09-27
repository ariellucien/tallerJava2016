/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinnerFilosophers;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrador1
 */
public class Philosopher extends Thread
{
    Semaphore cuchillo;
    Semaphore tenedor;
    Semaphore mesa;
    int id;

    public Philosopher(Semaphore mesa, Semaphore cuchillo, Semaphore tenedor, int id) {
        this.mesa = mesa;
        this.cuchillo = cuchillo;
        this.tenedor = tenedor;
        this.id = id;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                mesa.acquire();
                System.out.println("filosofo "+id+ " y estoy sentado en la mesa");
                cuchillo.acquire();
                System.out.println("filosofo "+id+ " obtuve el cuchillo");
                tenedor.acquire();
                System.out.println("filosofo "+id+ " obtuve el tenedor");
                comer();                
                tenedor.release();
                cuchillo.release();
                mesa.release();
            } catch (InterruptedException ex) {
                System.out.println("la exception " + ex.toString());
            }
        }
    }        

    private void comer() {
        try {
            System.out.println("soy el filosofo " + id + " y estoy comiendo");
            sleep((long) (Math.random()%15000 + 15000));
            System.out.println("soy el filosofo " + id + " y terminé de comer");
        } catch (InterruptedException ex) {
            
        }
    }
}
