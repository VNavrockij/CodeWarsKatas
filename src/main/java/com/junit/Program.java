package com.junit;

public class Program {
    public static void main(String[] args) {
        HighestAndLowest kata = new HighestAndLowest();
        String result = kata.highAndLow("1 2 3 4 5");  // return "5 1"
        System.out.println(result);

//        highAndLow("1 2 -3 4 5"); // return "5 -3"
//        highAndLow("1 9 3 4 -5"); // return "9 -5"
    }
}
