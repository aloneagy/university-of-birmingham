package day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(6666);
        while (true){
            Socket accept=serverSocket.accept();

            new Thread(()->{
                try(
                        BufferedInputStream bis=new BufferedInputStream(accept.getInputStream());
                        FileOutputStream fis=new FileOutputStream(System.currentTimeMillis()+".jpg");
                        BufferedOutputStream bos=new BufferedOutputStream(fis);
                        ){
                    byte[] b=new byte[1024*8];
                    int len;
                    while ((len=bis.read(b))!=-1){
                        bos.write(b,0,len);
                    }
                    OutputStream out=accept.getOutputStream();
                    out.write("ok".getBytes());
                    out.close();
                    bos.close();
                    bis.close();
                    accept.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
