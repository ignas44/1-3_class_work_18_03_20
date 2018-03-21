import java.util.Scanner;

public class uzdavinys2 {
    public static final int MAX = 100;

    public static void main(String[] args) {

        System.out.println("Iveskite kiek skaiciu iveskite");
        Scanner sc= new Scanner(System.in);
        int kiek = sc.nextInt();
        int [] masyvas= new int[kiek];
        for (int i =0;i<kiek;i++){
            System.out.println("Iveskite skaicius" + i + "Skaiciu");
            masyvas[i]= sc.nextInt();
            printMas(masyvas);

        }

    }
    private static void printMas(int [] masyvasKitameMetode){
        for (int sk:masyvasKitameMetode){
            if (sk>MAX){
                System.out.println(sk);
                //System.out.print(sk + " "); spausdina tik ta kintamaji neperkeldamas eilutes
            }
        }
    }
}
