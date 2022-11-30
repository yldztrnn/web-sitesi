package ders02_dataturleri_sacanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir double, bir de int sayi alıp bunalrın toplamaını ve carpımını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen ondalıklı bir sayi giriniz");
        double ondalikliSayi=scan.nextDouble();

        System.out.println("lütfen bir tamsayi giriniz");
        int tamsayi= scan.nextInt();

        System.out.println(ondalikliSayi+tamsayi);
        System.out.println(ondalikliSayi*tamsayi);


    }
}
