package c04_matematikislemler_incrementdecrement;

import java.util.Scanner;

public class c03_DataCasting {
    public static void main(String[] args) {

        //kullanicidan iki int deger alıp
        //bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tamsayi değeri giriniz ");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        double bolmeSonucu = (double)(sayi1/sayi2);
        System.out.println(bolmeSonucu);
    }
}