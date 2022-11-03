package miniProjeler;

import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double kg,length,result;
        Scanner index = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        kg = index.nextDouble();
        System.out.print("Boyunuzu metre olarak giriniz: ");
        length = index.nextDouble();
        result= kg/(length*length);
        System.out.println("Vücut Kitle İndeksiniz :"+result);
    }
}
