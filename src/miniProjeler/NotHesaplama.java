package miniProjeler;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        System.out.println("Basit Not Hesaplama Programına Hoşgeldiniz");
        int tur,mat,fen,muzik,kim,tar,toplam;

        Scanner score = new Scanner(System.in);

        System.out.print("Tükçe Notunu Gİriniz: ");
        tur = score.nextInt();
        System.out.print("Matematik Notunu Gİriniz: ");
        mat = score.nextInt();
        System.out.print("Fen Notunu Gİriniz: ");
        fen = score.nextInt();
        System.out.print("Müzik Notunu Gİriniz: ");
        muzik = score.nextInt();
        System.out.print("Kimya Notunu Gİriniz: ");
        kim = score.nextInt();
        System.out.print("Tarih Notunu Gİriniz: ");
        tar = score.nextInt();
        toplam = tur+mat+fen+muzik+kim+tar;

        double ort = toplam/6;
        System.out.println("Not Ortalamanız: "+ort);

        boolean ortalama = ort >=60;
        String durum= ortalama? "Geçtiniz": "Kaldınız";

        System.out.println("Başarı Durumunuz: "+durum);
    }
}