package logicadenegocios.socket;

import java.io.*;
import java.net.*;

/**
 *
 * @author emifu
 */
public class Cliente {
    static final String HOST = "localhost";
    static final int PUERTO=5000;
    public Cliente() {
        try{
            Socket skCliente = new Socket( HOST , PUERTO );
            InputStream aux = skCliente.getInputStream();
            DataInputStream flujo = new DataInputStream( aux );
            System.out.println( flujo.readUTF() );
            skCliente.close();
        } catch( IOException e ) {
            System.out.println( e.getMessage() );
        }
    }
}
