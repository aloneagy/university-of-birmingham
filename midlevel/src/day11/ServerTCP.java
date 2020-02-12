package day11;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket server=ss.accept();
        InputStream is=server.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read();
        String msg=new String(b,0,len);
        System.out.println(msg);
        is.close();
        server.close();

    }
}
