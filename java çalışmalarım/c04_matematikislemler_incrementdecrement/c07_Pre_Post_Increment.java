package c04_matematikislemler_incrementdecrement;

public class c07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        int b=a++;//önce işlem , sonra artma

        int c=++b;//önce artma, sonra işlem

        System.out.println("a:"+ a +",b:"+ b +",c:"+c);

        a= 20;

        b =++a; //önce artır,sonra islem

        c =a++;// önce islem,sonra artır

        System.out.println("a:"+a+",b:"+b+",c:"+c);


    }
}
