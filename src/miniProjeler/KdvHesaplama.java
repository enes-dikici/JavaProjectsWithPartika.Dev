package miniProjeler;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliTutar,kdv;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz:");
        tutar = inp.nextDouble();

        kdvliTutar = tutar < 1000 ? (tutar * kdvOrani1 + tutar) : (tutar * kdvOrani2 + tutar);
        kdv = tutar < 1000 ? kdvOrani1 : kdvOrani2;
        System.out.println("Tutar: " + tutar);
        System.out.println("Kdv Oranınız :"+kdv);
        System.out.println("KDV'li fiyatınız: " + kdvliTutar);

    }
}
