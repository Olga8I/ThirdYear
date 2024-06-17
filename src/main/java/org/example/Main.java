package org.example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        int symbol = 'a';
        int k = 3;
        int flag = 0;

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (InputStream inputStream = new FileInputStream(inputFileName);
             OutputStream outputStream = new FileOutputStream(outputFileName)) {

            int c;
            while ((c = inputStream.read()) != -1) {
                if (c == symbol) {
                    if (flag == 0) {
                        continue;
                    } else {
                        if (k > 0) {
                            outputStream.write(c);
                            k--;
                        }
                        outputStream.write(symbol);
                    }
                } else {
                    outputStream.write(c);
                }
                if (k == 0) {
                    flag = 0;
                }
            }
        }
    }
}