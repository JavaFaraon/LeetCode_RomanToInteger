package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Solution solution = new Solution();
        System.out.println("Result = " + solution.romanToInt(inputString()));
    }

    public String inputString() {
        System.out.println("Введите римское число в виде строки БОЛЬШИМИ БУКВАМИ");
        Scanner scan = new Scanner(System.in);
        String s;
        if (scan.hasNextLine()) {
            s = scan.nextLine();
            if (!Objects.equals(s, "")) {
              if (!isMatch(Pattern.compile("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$"), s)) {
                  System.out.println("Вы ввели число в неправильном формате");
                  return  inputString();
              } else System.out.println("Вы ввели " + s);
            } else {
                return inputString();
            }
        } else {
            return inputString();
        }
        return s;
    }

    public boolean isMatch(Pattern ptr, String str) {
        Matcher matcher = ptr.matcher(str);
        return matcher.find();
    }
}