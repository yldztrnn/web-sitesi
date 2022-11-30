package ders03_datacastingWappeerClass;

import java.util.Scanner;

public class c03_datacasting {

    public static void main(String[] args) {
        // kullanıcıdan bir tamsayı alın
        // kulanıcı kac girerse girsin
        // konsolda -128 ile +127 arasında bir sonuç yazdıracak
        // kod yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();
        byte donusensayi=(byte) girilenSayi;
        System.out.println("girdiğniz"+girilenSayi + "nin donusmus hali:"+donusensayi);
    }
}
