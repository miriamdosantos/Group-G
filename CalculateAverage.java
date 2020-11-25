package calculateaverage;

import java.util.Scanner;

/* @author diegolucas */

public class CalculateAverage {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println();
        System.out.println("From 0 to 10, how good are you at maths?");
        int a = number.nextInt();
        System.out.println("From 0 to 10, how good are you at solving problems?");
        int b = number.nextInt();
        System.out.println("From 0 to 10, what was your highest mark in maths?");
        int c = number.nextInt();
        int avg = (a + b + c) / 3;
        
        if (avg <= 4) {
            System.out.println("You need to study more! Your average is "+avg);
        }
        else if (avg <= 8) {
            System.out.println("That's great. Keep going! Your average is "+avg);
        }
        else {
            System.out.println("Amazing! "+avg+"? You'll be the next Albert Einstein!");
        }
    }

}
