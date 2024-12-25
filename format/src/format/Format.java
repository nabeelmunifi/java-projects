package format;

import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the grade");

        String result = "";

        int grade = s.nextInt();
        if (grade >= 50 && grade <= 100) {
            result = "success";
            if (grade >= 90) {
                result += "\nexcellant";
            } else if (grade < 90 && grade >= 80) {
                result += "\nvery good";
            } else if (grade < 80 && grade >= 70) {
                result += "\ngood";
            } else if (grade > 70 && grade <= 60) {
                result += "\naccepted";
            } else {
                result += "\nnot good";
            }

        } else if (grade < 0 || grade > 100) {
            result = "enter avlid number";
        } else {
            result = "fail";
        }
        System.out.println(result);

    }
}
