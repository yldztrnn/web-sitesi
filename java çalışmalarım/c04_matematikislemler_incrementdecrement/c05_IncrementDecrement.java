package c04_matematikislemler_incrementdecrement;

public class c05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi = 10;
        //bu sayiyi 3 artiralim ve yazdiralım

        sayi  += 3;

        System.out.println(sayi);//13

        int s=10;
        //bu sayiyi 1 artirin
        s=s+1;
        System.out.println(s);//11

        s+=1;
        System.out.println(s);//12

        s++;
        System.out.println(s);//13

        ++s;
        System.out.println(s);//14


        int t=10;
        //bu sayinin degerini 1 eksilt
        t=t-1; //9
        t-=1; //8
        t--;//7
        --t;//6
        System.out.println(t);
    }
}
