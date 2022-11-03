package miniProjeler;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.print("Lütfen üçgenin birinci kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();

        System.out.print("Lütfen üçgenin ikinci kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();

        System.out.print("Lütfen üçgenin üçüncü kenar uzunluğunu giriniz: ");
        c = scanner.nextInt();

        double u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin çevresi: " + cevre );
        System.out.println("Üçgenin alanı: " + alan);
    }

}

