import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uzdavinyssunkesnis3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Pasirinkite kieno plota skaiciuosite \n 1. Staciojo trikampio plotas\n2. Staciakampio plotas\n3.Kvadrato plotas\n4.Apskritimo plotas");
        int kokspl=sc.nextInt();

            switch (kokspl) {
                case 1:
                    System.out.println("iveskite a");
                    double a = gautTeisingaIvedima();
                    System.out.println("iveskite b");
                    double b = gautTeisingaIvedima();
                    System.out.println("plotas: " + staciojoTrikampioPlotas(a, b));
                    break;
                case 2:

                    System.out.println("iveskite a");
                    double c = gautTeisingaIvedima();
                    System.out.println("iveskite b");
                    double d = gautTeisingaIvedima();
                    System.out.println("plotas: " + staciakampioPlotas(c, d));
                    break;
                case 3:
                    System.out.println("iveskite a");
                    double e = gautTeisingaIvedima();

                    System.out.println("plotas: " + kvadratoPlotas(e));
                    break;
                case 4:
                    System.out.println("iveskite a");
                    double f = gautTeisingaIvedima();

                    System.out.println("plotas: " + apskritimoPlotas(f));
                    break;
                default:
                    System.out.println("ivedete bloga pasirinkima");
            }



    }
    public static double staciojoTrikampioPlotas(double a, double b){
        double plotas=0;
        plotas=(a*b)/2;
     return plotas;
    }
    public static double staciakampioPlotas(double a, double b){
        double plotas=0;
        plotas=a*b;
        return plotas;
    }
    public static double kvadratoPlotas(double a){
        double plotas=0;
        plotas=a*a;
        return plotas;
    }
    public static double apskritimoPlotas(double a){
        double plotas=0;
        plotas=3.1415*(a*a);
        return plotas;
    }
    private static double gautTeisingaIvedima (){
        Scanner sc=new Scanner(System.in);
        double result=0;
        while (true){
            try {
                result=sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("blogas ivedimas");
                sc.nextLine();
            }
        }

        return result;
    }
}
