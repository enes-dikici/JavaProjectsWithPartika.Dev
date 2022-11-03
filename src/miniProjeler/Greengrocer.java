package miniProjeler;

import java.util.Scanner;

public class Greengrocer {
    public static void main (String[]args)
    {
        double arK,elK,domK,muzK,patK,arF,elF,domF,muzF,patF,toplamF;
        Scanner inp=new Scanner(System.in);

        System.out.print("Armut Kg giriniz:");
        arK=inp.nextDouble();
        System.out.print("Elma Kg giriniz:");
        elK=inp.nextDouble();
        System.out.print("Domates Kg giriniz:");
        domK=inp.nextDouble();
        System.out.print("Muz Kg giriniz:");
        muzK=inp.nextDouble();
        System.out.print("Patlıcan Kg giriniz:");
        patK=inp.nextDouble();

        arF = (arK*2.14);
        elF = (elK*3.67);
        domF = (domK*1.11);
        muzF = (muzK*0.95);
        patF = (patK*5.00);

        toplamF = arF+elF+domF+muzF+patF;
        System.out.println("Toplam Tutar:"+toplamF+" TL");

    }
}