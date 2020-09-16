package com.efectivejava.tryresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public void read() throws IOException {

        try (BufferedReader bf = new BufferedReader(new FileReader("emre.txt"))) {
            bf.readLine();
        } finally {
            //bf.close();
        }
    }

    public void read2() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("emre.txt"));
        try {

        } finally {
            bf.close();
        }
    }
}
