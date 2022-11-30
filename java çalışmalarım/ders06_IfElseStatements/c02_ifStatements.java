package ders06_IfElseStatements;

import java.util.Scanner;

public class c02_ifStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir üçgenin 3kenar uzunluğunu alın,
        //üçgen kenar ise "eşkenar üçgen"yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 kenarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 =scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eşkenar üçgen");
        }

    }
}
