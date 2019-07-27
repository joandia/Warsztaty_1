package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Random r = new Random();
        int wylosowanaLiczba = r.nextInt(101) + 1;

        System.out.println("zgadnij liczbe");

        Scanner scanner = new Scanner(System.in);

        int wczytanaLiczba = 0;

        try {
            wczytanaLiczba = scanner.nextInt();

            Integer.valueOf(wczytanaLiczba); //zmienia tekst na liczbe
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("to nie jest liczba");
        }

        while (true) {
            if (wczytanaLiczba < wylosowanaLiczba) {
                System.out.println("za malo");

            } else {
                if (wczytanaLiczba > wylosowanaLiczba) {
                    System.out.println("za duzo");

                } else {
                    if (wczytanaLiczba == wylosowanaLiczba) {
                        System.out.println("zgadles!");
                        break;
                    }
                }
            }
            wczytanaLiczba = scanner.nextInt();
        }
    }
}
