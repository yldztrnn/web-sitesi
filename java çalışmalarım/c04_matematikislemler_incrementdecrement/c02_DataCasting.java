package c04_matematikislemler_incrementdecrement;

import java.util.Scanner;

public class c02_DataCasting {
    public static void main(String[] args) {
        //kullanicidan iki double sayi alin,
        //ilk sayiyi ikinci sayiya bolun ve bolum isleminin
        //sonucunun tamsayi kismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolmeSonucuTamsayi= (int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);


    }
}
