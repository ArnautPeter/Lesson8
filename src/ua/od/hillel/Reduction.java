package ua.od.hillel;


import java.util.Scanner;

public class Reduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input same text: ");
        String str = sc.nextLine();
        String[] rezult = str.split(" ");

        for (int i = 0; i < rezult.length; i++) {
            rezult[i] = reduce(rezult[i]);
        }

        System.out.println("Rezult: ");
        for (String temp : rezult) {
            System.out.print(temp + " ");
        }
    }

    public static String reduce(String str) {
        if (str.length() < 4) return str;
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            count++;
        }
        String rezult = str.toCharArray()[0] + Integer.toString(count) + str.toCharArray()[str.length() - 1];
        return rezult;
    }
}
