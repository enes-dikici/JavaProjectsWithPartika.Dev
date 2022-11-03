package miniProjeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        int km;
        double perKm=2.20,price;
        System.out.print("Gidilen Mesafeyi Giriniz: ");
        km = distance.nextInt();
        price = km*perKm+10;
        price=(price<=20)? 20:price;

        System.out.println("Ücret: "+price);
    }

}
