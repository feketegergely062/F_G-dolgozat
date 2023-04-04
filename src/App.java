import java.util.Scanner;

/*
* File: App.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1/N
* Date: 2023-04-04
* Github: https://github.com/feketegergely062/F_G-dolgozat
* Licenc: GNU GPL
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Feladat: 0366");
        System.out.print("Keszitette: Fekete Gergely, I/1/N 2023-04-04\n");
        Scanner testatlo = new Scanner(System.in);
        System.out.println(" Addja meg a kocka lapátlójának hosszát: ");
        double d = testatlo.nextDouble();
        System.out.println(" Addja meg a kocka oldalának hosszát: ");
        double a = testatlo.nextDouble();
        double terfogat = d*3/a;

        System.out.println(terfogat);
    }
}
