package blancaflor;

import java.util.Scanner;

public class Blancaflor {

    public static void main(String[] args) {
        Scanner denden = new Scanner(System.in);
        int Mynum = denden.nextInt();

        if (Mynum > 0) {
            System.out.println("positive");
            if (Mynum % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        } else if (Mynum < 0) {
            System.out.println("negative");
            if (Mynum % 3 == 0) {
                System.out.println("divisible");
            } else {
                System.out.println("not");
            }
        }
    }
}
