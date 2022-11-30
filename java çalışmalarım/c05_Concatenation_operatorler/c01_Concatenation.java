package c05_Concatenation_operatorler;

public class c01_Concatenation {
    public static void main(String[] args) {

        //sadece asagidaki verilen variable'leri kullanarak istenen degerleri yazalim

        String s1= "java";
        String s2="Guzeldir";
        String s3="";
        String s4=" ";

        int sayi1=4;
        int sayi2=3;

        //java Güzeldir7
        System.out.println(s1+s4+s2+(sayi1+sayi2));//java Guzeldir7

        //java Guzeldir 12


        System.out.println(s1+s4+s2+s4+sayi1*sayi2);

        //34 java

        System.out.println(s3+sayi2+sayi1+s4+s1);

        //java7 Guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+s3+sayi1+sayi2);

    }
}
