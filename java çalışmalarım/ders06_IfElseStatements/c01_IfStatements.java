package ders06_IfElseStatements;

import java.util.Scanner;

public class c01_IfStatements {

    public static void main(String[] args) {
      //kullanıcıdan bir harf alin, harf ile başlayan bir ay varsa yazdirin.
        //kullanici o veya 0 yazdiginda output ocak olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini girin");
        char ilkHarf= scan.next().charAt(0);

        if (ilkHarf=='o'|| ilkHarf=='O'){
            System.out.println("Ocak");

        }
        if (ilkHarf=='s'|| ilkHarf=='S'){
            System.out.println("Subat");
        }
        if (ilkHarf=='m'|| ilkHarf=='M'){
            System.out.println("Murat");
        }
        if (ilkHarf=='n'|| ilkHarf=='N'){
            System.out.println("Nisan");
        }
        if (ilkHarf=='h'|| ilkHarf=='H'){
            System.out.println("Haziran");
        }

    }
}
