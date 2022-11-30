package ders03_datacastingWappeerClass;

import java.util.Scanner;

public class c04_chardatacasting {
    public static void main(String[] args) {

        System.out.println('a'+'b');//195

        //kullanıcıdan char bir karakter alın
        //o karakterden sonra gelen 3 karakteri yazdırın
        //ornek ınput:a output:bcd

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKrk= scan.next().charAt(0);
        System.out.println("" +(char) (girilenKrk+1)+(girilenKrk+2)+(girilenKrk+3));

    }
}
