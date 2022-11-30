package ders06_IfElseStatements;

import java.util.Scanner;

public class c05_IfElseStatements {
    public static void main(String[] args) {
        //kullanicidan yasisini isteyin,65 yas ve üzeri ise "emekli olabilirsin"yazdırın
        //yoksa emekli olmasi için calismasi gereken yil sayisini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olmak için" + (65-yas) + "sene daha calışmalısın");
        }
    }
}
