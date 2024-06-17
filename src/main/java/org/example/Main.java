package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";

        String str1 = "";
        System.out.println("Enter text");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();

        char[] charArray = str1.toCharArray();

        for(int i = 0; i < str1.length(); i++){
            System.out.print(charArray[i] + "   ");
        }
        System.out.println(" ");

        for (char x : charArray){
            if(x == ' '){
                System.out.print("");
            } else {
                int i = alphabet.lastIndexOf(x);
                i+=1;
                System.out.print(i + "  ");
            }
        }
    }
}