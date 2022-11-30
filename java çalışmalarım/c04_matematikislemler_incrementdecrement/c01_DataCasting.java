package c04_matematikislemler_incrementdecrement;

public class c01_DataCasting {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=5;
        System.out.println(sayi1/sayi2);//4

        //bolunen ve bolen ikisi de tamsayi ise,
        //java sonucun sadece tamsayi kismini alir.

        double sayi3=6;
        System.out.println(sayi1/sayi3);//double java geniş alana göre davranır

    }
}
