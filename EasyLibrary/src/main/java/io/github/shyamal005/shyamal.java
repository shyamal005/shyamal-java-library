package io.github.shyamal005;

import java.util.Scanner;

public class shyamal {
    private static Scanner sc = new Scanner(System.in);

    // ========= PRINTING =========
    public static void p(String msg) {
        System.out.println(msg);
    }

    public static void p(int msg) {
        System.out.println(msg);
    }

    public static void p(double msg) {
        System.out.println(msg);
    }

    public static void p(char msg) {
        System.out.println(msg);
    }
// INPUTS
    public static String getString(String prompt) {
        System.out.print(prompt + " ");
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt + " ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input, enter an integer: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); // clear buffer
        return value;
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt + " ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input, enter a decimal: ");
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine(); // clear buffer
        return value;
    }

    public static char getChar(String prompt) {
        System.out.print(prompt + " ");
        String input = sc.nextLine();
        while (input.length() != 1) {
            System.out.print("Enter only one character: ");
            input = sc.nextLine();
        }
        return input.charAt(0);
    }

    public static boolean getYesNo(String prompt) {
        System.out.print(prompt + " (y/n): ");
        String input = sc.nextLine().trim().toLowerCase();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.print("Please enter y or n: ");
            input = sc.nextLine().trim().toLowerCase();
        }
        return input.equals("y");
    }

    // Maths
    public static int square(int x) {
        return x * x;
    }

    public static double square(double x) {
        return x * x;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static double min(double a, double b) {
        return (a < b) ? a : b;
    }

    public static void pause(String msg) {
        System.out.print(msg + " (press Enter to continue) ");
        sc.nextLine();
    }
}
