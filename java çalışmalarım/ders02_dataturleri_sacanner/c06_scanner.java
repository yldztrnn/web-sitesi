package ders02_dataturleri_sacanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp
        //dikdörtgenin alanını yazdırın.
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen diktörtgenin iki kenar uzunluğunu girin"+
                "\niki kenar uzunluğu arasında enter'a basin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("diktördgenin alanı:"+(kenar1+kenar2));
    }

}
