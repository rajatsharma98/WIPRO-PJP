/*
Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

class NumberOutOfBoundsException extends Exception {
    public NumberOutOfBoundsException () {
        super();
    }
    public String toString() {
        return "NumberOutOfBoundsException";
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException () {
        super();
    }
    public String toString() {
        return "NegativeNumberException";
    }
}

class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of first student: ");
        String s1 = sc.next();
        System.out.println("Enter name of second student: ");
        String s2 = sc.next();

        int arr[] = new int[3], sum1 = 0;
        int brr[] = new int[3], sum2 = 0;

        System.out.println("Enter 3 marks for " + s1 + ": ");
        for (int i = 0;i < 3;i++) {
            int a = 0;
            try {
                a = Integer.parseInt(sc.next());
                if (a > 100) throw new NumberOutOfBoundsException();
                else if (a < 0) throw new NegativeNumberException();
            }
            catch (NumberOutOfBoundsException e) {
                System.out.println(e.toString());
                return;
            }
            catch (NegativeNumberException e) {
                System.out.println(e.toString());
                return;
            }
            catch (Exception e) {
                System.out.println(e.getClass().getCanonicalName());
                return;
            }

            arr[i] = a;
            sum1 += a;
        }
        System.out.println("Enter 3 marks for " + s2 + ": ");
        for (int i = 0;i < 3;i++) {
            int a = 0;
            try {
                a = Integer.parseInt(sc.next());
                if (a > 100) throw new NumberOutOfBoundsException();
                else if (a < 0) throw new NegativeNumberException();
            }
            catch (NumberOutOfBoundsException e) {
                System.out.println(e.toString());
                return;
            }
            catch (NegativeNumberException e) {
                System.out.println(e.toString());
                return;
            }
            catch (Exception e) {
                System.out.println(e.getClass().getCanonicalName());
                return;
            }

            brr[i] = a;
            sum2 += a;
        }
        System.out.println("Average for " + s1 + " = " + (sum1 * 1.0 / 3));
        System.out.println("Average for " + s2 + " = " + (sum2 * 1.0 / 3));
    }
}