package ua.od.hillel;

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input e-mail: ");
        String email = sc.nextLine();
        email = email.replace("@", "[at]");
        email = email.replace(".", "[dot]");
        System.out.println("Rezult: " + email);
    }
}
