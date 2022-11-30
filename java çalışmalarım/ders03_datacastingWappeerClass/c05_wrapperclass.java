package ders03_datacastingWappeerClass;

public class c05_wrapperclass {
    public static void main(String[] args) {

        int sayi=10;
        String str="java cok güzel";

        /*
        
         */

        char krk ='b';

        Character krkWrapper ='c';
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('7'));

        String str1="123";
        String str2="12";
        //str1 ve str2'nin degerlerini matematiksel olarak toplayin

        System.out.println(str1 + str2);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        // Integer.parseInteger(str) içine yazılan str rakamlardan
        //olusuyorsa str'i int'a cevirir
        //ancak bir karakter bile değilse hata verir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


    }
}
