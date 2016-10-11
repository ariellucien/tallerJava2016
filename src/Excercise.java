
import java.util.concurrent.CyclicBarrier;

/*

Realiza un programa multihilo que:
    1. recibe un arreglo de 4 posiciones. Cada posición del arreglo almacena
       el resultado de un cálculo.
       La casilla 0 guarda el número primo máximo menor a 10,000
       La casilla 1 guarda el númeor natural perfecto máximo que es menor a 100, 000
       La casilla 2 guarda la suma de pares entre 1 y 10,000
       La casilla 3 guarda un número aleatorio entre 100,000 y 1,000,000

    2. cada acción es realizada por un hilo diferente
    3. hay una barrera que espera a que los 4 hilos terminen y 
       cuando finalizan imprime los resultados del arreglo

 */

public class Excercise {
    public static void main(String[] args) {
        int[]arregloResultados;
        arregloResultados = new int[4];
        
        Accion a = new Accion(arregloResultados);
        CyclicBarrier c = new CyclicBarrier(4, a);
    }

    private static class Accion implements Runnable{
        int[]arreglo;

        public Accion(int[] arreglo) {
            this.arreglo = arreglo;
        }

        @Override
        public void run() {
            System.out.println("el número primo máximo menor a 10,000 "+ arreglo[0]);
            System.out.println("el número natural perfecto máximo que es menor a 100,000" + arreglo[1]);
            System.out.println("la suma de pares entre 1 y 10,000 es " + arreglo[2]);
            System.out.println("el número aleatorio entre 100,000 y 1,000,000 " + arreglo[3]);
        }
        
        
    }
}
