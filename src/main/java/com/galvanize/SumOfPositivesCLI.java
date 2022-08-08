package com.galvanize;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
       int sum = 0;

       for (int i = 0; i < args.length; i++) {
           int tempNumb = Integer.parseInt(args[i]);
           if (tempNumb > 0) {
               sum+=tempNumb;
           }
       }

        System.out.println(sum);
    }
}
