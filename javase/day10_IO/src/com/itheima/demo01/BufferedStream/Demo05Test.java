package com.itheima.demo01.BufferedStream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.HashMap;

public class Demo05Test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("day10_IO\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_IO\\out.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;

            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
