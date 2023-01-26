
package logicadenegocios;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author emifu
 */
public class Conexion {
    private ServidorLocal sl;
    private ServerSocket ss;
    private Socket s;
    private String ip;

    public Conexion(ServidorLocal sl) {
        this.sl = sl;
        try {
            this.ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
        }
    }

    public ServidorLocal getSl() {
        return sl;
    }

    public void setSl(ServidorLocal sl) {
        this.sl = sl;
    }

    public ServerSocket getSs() {
        return ss;
    }

    public void setSs(ServerSocket ss) {
        this.ss = ss;
    }

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
