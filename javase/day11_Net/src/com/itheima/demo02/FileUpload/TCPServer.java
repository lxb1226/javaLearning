package com.itheima.demo02.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket s = server.accept();
//        FileOutputStream fos = new FileOutputStream(new File("day11_Net\\web\\upload\\1.jpg"));
        InputStream is = s.getInputStream();

        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase\\day11_Net\\web\\upload");
        if(!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        OutputStream oos = s.getOutputStream();
        oos.write("上传成功".getBytes());
        fos.close();
        s.close();
        server.close();
    }
}
