package ders03_datacastingWappeerClass;

public class c02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi =20;

        /*
        geniş data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumluluğu almanızı ister

        bu sorumluluğu almak  için cast
        edeceğimiz değer'in onune () içerisine
        cast etmek istediğimiz data turu yazılır.

         ancak bu durumda data kayıpları (double'den int'e gecerken
         virgulden sonrası silinir) veya baskalasım olabilir (int'i byte
         cevirirsek tekrar tekrar basa döner)

         */
        short sh= (short)sayi;

        System.out.println(sh);//20
        double dbl =23.5;
        int say =(int) dbl;
        System.out.println(say);//23

        say=15;
        byte byt=(byte) say;
        System.out.println(byt);//15


    }
}
