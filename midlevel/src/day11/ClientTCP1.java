package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP1 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",666);
        OutputStream os=client.getOutputStream();
        os.write("ok?".getBytes());
        InputStream in=client.getInputStream();
        byte[] b=new byte[100];
        int len=in.read(b);
        System.out.println(new String(b,0,len));
        in.close();
        os.close();
        client.close();
    }


}
