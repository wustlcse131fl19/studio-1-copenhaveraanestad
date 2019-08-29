package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Input n1:");
        int n2 = ap.nextInt("Input n2:");
        System.out.println("Your average is: " + (0.0 + n1 + n2)/2);
    }
}
