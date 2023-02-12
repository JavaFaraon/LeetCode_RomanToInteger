package org.example;

import java.sql.Array;

public class Solution {
    public int romanToInt(String s) {
        char [] chars = s.toCharArray();
        int result = 0;
        int arabic = 0;
        int arabicPrevious = 0;
        Main main = new Main();
        for (int i = chars.length -1; i >= 0 ; i--) {
            switch (chars[i]) {
                case 'M' -> arabic = 1000;
                case 'D' -> arabic = 500;
                case 'C' -> arabic = 100;
                case 'L' -> arabic = 50;
                case 'X' -> arabic = 10;
                case 'V' -> arabic = 5;
                case 'I' -> arabic = 1;
                default -> {
//                    System.out.println("Выражение ошибочно.");
//                    main.inputString();
                }
            }
            if (arabic >= arabicPrevious) {
                result+=arabic;
            } else result-=arabic;
            arabicPrevious = arabic;
        }
        return result;
    }
}
