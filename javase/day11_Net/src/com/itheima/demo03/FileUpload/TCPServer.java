package com.itheima.demo03.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        /*
        让服务器一直处于监听状态
        有一个客户端上传文件，就保存一个文件。
         */
        while (true) {
            Socket s = server.accept();
/*
使用多线程技术，提高程序的效率
    有一个客户端上传文件，就开启一个线程，完成文件的上传
 */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 完成文件的上传
                    try {
                        InputStream is = s.getInputStream();

                        File file = new File("E:\\workspace\\projects\\java\\itcast\\javase\\day11_Net\\web\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }

                        String filename = "itcast" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        OutputStream oos = s.getOutputStream();
                        oos.write("上传成功".getBytes());
                        fos.close();
                        s.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }

    }
}
