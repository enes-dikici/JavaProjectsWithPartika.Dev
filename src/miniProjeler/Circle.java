package miniProjeler;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r,pi=3.14,a,slice;
        System.out.print("Dilim alanını öğrenmek için merkez açısını giriniz: ");
        a= inp.nextDouble();
        System.out.print("Yarıçapı giriniz: ");
        r= inp.nextDouble();
        slice = (pi*(r*r)*a)/360;
        System.out.println("Dilim alanı: "+slice);


    }
}
