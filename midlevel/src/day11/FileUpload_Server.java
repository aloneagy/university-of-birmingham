package day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        Socket accept=ss.accept();

        BufferedInputStream bis=new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.jpg"));

        byte[] b=new byte[1024*8];
        int len;
        while ((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
        accept.close();
    }
}
