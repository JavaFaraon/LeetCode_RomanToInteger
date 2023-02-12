package org.example;

import java.sql.Array;

public class Solution {
    public int romanToInt(String s) {
        char [] chars = s.toLowerCase().toCharArray();
        int result = 0;
        int arabic = 0;
        int arabicPrevious = 0;
        Main main = new Main();
        for (int i = chars.length -1; i >= 0 ; i--) {
            switch (chars[i]) {
                case 'm' -> arabic = 1000;
                case 'd' -> arabic = 500;
                case 'c' -> arabic = 100;
                case 'l' -> arabic = 50;
                case 'x' -> arabic = 10;
                case 'v' -> arabic = 5;
                case 'i' -> arabic = 1;
                default -> {
                    System.out.println("Выражение ошибочно.");
                    main.inputString();
                }
            }
            System.out.println("Arabic = " + arabic);

            if (arabic >= arabicPrevious) {
                result+=arabic;
            } else result-=arabic;
            arabicPrevious = arabic;
        }
        return result;
    }
}
