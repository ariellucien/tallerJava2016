/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatcliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author administrador1
 */
public class ThreadEnvia implements Runnable{
        private Socket connection;
        private final chatcliente.Principal main;
        String mensaje;

        ObjectOutputStream salida;

        public ThreadEnvia(Socket connection, final chatcliente.Principal main) {
            this.connection = connection;
            this.main = main;                

            main.campoTexto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {                
                    mensaje = e.getActionCommand();
                    enviarMensaje(mensaje);
                    main.campoTexto.setText("");
                }
            });        
        }        

        void enviarMensaje(String mensaje)
        {
            try {
                salida.writeObject("Cliente-> " + mensaje);
                salida.flush();            
                main.mostrarMensaje("Cliente-> " + mensaje  + "\n");            
            } catch (IOException ex) {            
                main.mostrarMensaje("no se pudo enviar el mensaje");
            }
        }

        @Override
        public void run() 
        {
            try {
                salida = new ObjectOutputStream(connection.getOutputStream());
                salida.flush();
            } catch (IOException ex) {

            }
        }    
}
