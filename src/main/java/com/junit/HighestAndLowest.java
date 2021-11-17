package com.junit;

public class HighestAndLowest {

    public int sum(int num) {
        int res = 0;
        for (int i = 0; i <= num; i++) {
            res += i;
        }
        return res;
    }

        public static String highAndLow(String numbers) {
            // highAndLow("1 2 3 4 5");  // return "5 1"

            String[] subStr = numbers.split(" ");

            int resIntOne, resIntTwo, temp;

            for (int i = 0; i < subStr.length; i++) {
                temp = Integer.parseInt(subStr[i]);
            }
            return "throw towel";
        }

}
