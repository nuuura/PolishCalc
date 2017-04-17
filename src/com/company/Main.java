package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Float> num = new Stack();
        String input = in.nextLine();
        List<String> numeral = Arrays.asList(input.split(" "));
        float a;
        float b;
        float c;
        for (String i : numeral) {
            if (i.equals("+")) {
                a = num.pop();
                b = num.pop();
                c = a+b;
                num.push(c);

            } else if (i.equals("-")) {
                a = num.pop();
                b = num.pop();
                c = b-a;
                num.push(c);

            } else if (i.equals("*")) {
                a = num.pop();
                b = num.pop();
                c = a*b;
                num.push(c);

            } else if (i.equals("/")) {
                a = num.pop();
                b = num.pop();
                c = b/a;
                num.push(c);


            } else {
                num.push((float)Integer.parseInt(i));

            }

        }
        System.out.println(num.peek());
    }

}