package day11;

import java.io.*;
import java.net.Socket;

public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test.jpg"));
        Socket socket=new Socket("localhost",6666);
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] b=new byte[1024*8];
        int len;
        while ((len=bis.read(b))!=-1){
            bos.write(b,0,len);
            bos.flush();
        }
        System.out.println("over");
        bos.close();
        socket.close();
        bis.close();

    }
}
