package ders02_dataturleri_sacanner;

import java.util.Scanner;

public class c07_scanner {
    public static void main(String[] args) {
        //kulanıcıdan ismini, soyismini ve yasini alıp,
        //ağağıdaki formata yazdırın.
        //isminiz:john
        //soyisminiz:doe
        //yaşınız:44
        //kaydınız basariyla tanımlanmıştır.
        Scanner scan=new Scanner(System.in);
        System.out.println("isiminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("kaydınız tamamlanmıştır");
    }
}
