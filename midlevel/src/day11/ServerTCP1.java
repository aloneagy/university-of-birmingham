package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(666);
        Socket server=ss.accept();

        InputStream is=server.getInputStream();

        byte[] b=new byte[1024];
        int len=is.read(b);
        String msg=new String(b,0,len);
        System.out.println(msg);

        OutputStream out=server.getOutputStream();
        out.write("fine".getBytes());
        out.close();
        is.close();
        server.close();
    }
}
