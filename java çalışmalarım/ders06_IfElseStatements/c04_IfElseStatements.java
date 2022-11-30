package ders06_IfElseStatements;

import java.util.Scanner;

public class c04_IfElseStatements {
    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyiniz
        //girilen karakterin buyuk olup olmadığını yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk <='Z'){
            System.out.println("büyük harf");
        }else{
            System.out.println("büyük harf değildir");
        }
    }
}
