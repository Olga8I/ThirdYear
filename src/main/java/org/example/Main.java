package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufferedReader = new BufferedReader(reader);

            FileOutputStream output = new FileOutputStream("output.txt");
            OutputStreamWriter writer = new OutputStreamWriter(output);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            int currentChar;
            boolean spaceNeeded = false;

            while ((currentChar = bufferedReader.read()) != -1) {
                if (Character.isLetter(currentChar)) {
                    bufferedWriter.write((char) currentChar);
                    spaceNeeded = true;
                } else if (currentChar == ' ' && spaceNeeded) {
                    bufferedWriter.write(' ');
                    spaceNeeded = false;
                }
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}