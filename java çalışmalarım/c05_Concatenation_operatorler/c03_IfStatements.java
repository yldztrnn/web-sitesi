package c05_Concatenation_operatorler;

import java.util.Scanner;

public class c03_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan iki sayi alin
        //eger birinci sayi 100'den buyukse,"ilk sayi 100'den buyuk" yazdirin
        //eger ikinci sayi ciftse,"ikinci sayi cift yazdirin"
        //eger ilk sayi,ikinci sayidan buyukse,"ilk sayi daha buyuk"yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki tamsayi giriniz");

        int s1= scan.nextInt();
        int s2= scan.nextInt();

        //eger birinci sayi 100'den buyukse,"ilk sayi 100'den buyuk"yazdirin
        if (s1>100){
            System.out.println("ilk sayi 100'den buyuk");
        }
        //eger ikinci sayi ciftse,"ikinci sayi cift yazdirin"
        if (s2%2==0){
            System.out.println("ikinci sayi cift yazdirin");
        }
        //eger ilk sayi,ikinci sayidan büyükse,"ilk sayi daha buyuk"yazdirin
        if (s1>s2){
            System.out.println("ilk sayi daha büyük");
        }
    }
}
