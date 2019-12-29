package javamtprostbroj;

import java.util.Scanner;

public class JavaMTProstBroj {

    public static void main(String[] args) {
        int n; // prost broj
        Scanner input = new Scanner(System.in);

        System.out.println("Ovwaj program odredjuje da li je");
        System.out.println("broj prost ili ne!!!");

        while (true) {
            System.out.println("Unesite broj veci od 1(Unesite 0 za kraj)");
            n = input.nextInt();
            if (n == 0) {
                break;

            }
            System.out.println("Taj broj: ");
            if (jeProstBroj(n)) {
                System.out.println("je ");
            } else {
                System.out.println("Nije");
            }
            System.out.println("Prost");
        }

    }

    private static boolean jeProstBroj(int n) {
        int maxDelilac = (int) Math.sqrt(n);
        for (int k = 2; k < maxDelilac; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }

}
