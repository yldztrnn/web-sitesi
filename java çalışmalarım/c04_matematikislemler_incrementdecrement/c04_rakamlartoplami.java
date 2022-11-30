package c04_matematikislemler_incrementdecrement;

import java.util.Scanner;

public class c04_rakamlartoplami {
    public static void main(String[] args) {
        //kullanıcının girdiği 4 basamakli bir sayinin
        //rakamlar toplamini veren bir kod yaziniz

        //1.yöntem
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen dört basamakli bir sayi giriniz");
        int input=scan.nextInt();



      //2.yöntem

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //1-birler basamagini al
        birlerBasamagi=input %10;//3
        //2-birler basamagini rakamlar toplamina ekle
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        //3-birler basamagindan kurtul
        input = input/10;

        birlerBasamagi=input % 10;//5
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//8
        input = input/10;

        birlerBasamagi=input %10;//4
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//12
        input = input/10;

        birlerBasamagi=input %10;//1
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//13
        input = input/10;


        System.out.println("verilen sayinin rakamlar toplami:"+rakamlarToplami);
    }
}
