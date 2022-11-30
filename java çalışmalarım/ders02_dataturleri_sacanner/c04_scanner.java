package ders02_dataturleri_sacanner;

import java.util.Scanner;

public class c04_scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp,büyük harflere yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        String kullanıcıAdı=scan.next();
        System.out.println(kullanıcıAdı.toUpperCase());
    }
}
