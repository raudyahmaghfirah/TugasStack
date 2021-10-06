package PemrogramanMahir;

import java.util.Scanner;

public class BalancedSymbol {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(25);
        String a = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner scn = new Scanner(a);

        scn.useDelimiter("");

        for (int i = 0; i < 25; i++){
            String karakter = scn.next();
            if(karakter.equals("(")) {
                stack.push("(");
            } else if (karakter.equals(")")) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}

