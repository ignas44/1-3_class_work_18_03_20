package kolekcijos;

import com.sun.javafx.scene.layout.region.Margins;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class atsiskaitymas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir zenkla tarp ju su tarpu");
        while (true) {
            try {

                Integer a = sc.nextInt();
                String b = sc.next();
                Integer c = sc.nextInt();

                while (c <= 0) {
                    System.out.println("Iveskite dar karta antro skaiciaus reiksme");
                    c += sc.nextInt();
                }

                switch (b) {
                    case "+":
                        System.out.println(a + "+" + c + "=" + suma(a, c));
                        break;
                    case "-":
                        System.out.println(a + "-" + c + "=" + skirtumas(a, c));
                        break;
                    default:
                          throw new InputMismatchException (); // pats ismeta klaida
                }
                break;
            } catch (InputMismatchException m) {
                System.out.println("Blogas ivedimas. Kartokite");
                sc.nextLine();
            }

        }

    }
    public static int suma(int a, int b){
         int sum= a+b;
         return sum;
    }
    public static int skirtumas(int a, int b){
        int skir= a-b;
        return skir;
    }






}
