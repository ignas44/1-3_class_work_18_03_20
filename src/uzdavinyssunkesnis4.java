import java.util.InputMismatchException;
import java.util.Scanner;

public class uzdavinyssunkesnis4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Iveskite kuno mase kilogramais");
        double m= gautTeisingaIvedima();
        System.out.println("Iveskite ugi metrais");
        double u= gautTeisingaIvedima();
        System.out.println("KMI: " +kmi(m,u));







    }
    private static double kmi (double m, double u){
        double kmi=0;
        kmi= m/Math.pow(u,2);


        return kmi;
    }
    private static double gautTeisingaIvedima (){
        Scanner sc=new Scanner(System.in);
        double result=0;
        while (true){
            try {
                result=sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("blogas ivedimas, iveskite dar karta");
                sc.nextLine();
            }
        }

        return result;
    }
}
