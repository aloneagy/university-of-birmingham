package day11;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",666);
        OutputStream os=client.getOutputStream();
        os.write("ok".getBytes());
        os.close();
        client.close();
    }
}
