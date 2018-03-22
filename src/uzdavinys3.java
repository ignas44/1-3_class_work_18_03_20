import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uzdavinys3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sk=0;

        int kiek=0;
        int [] mas= {};

        do{
            System.out.println("Iveskite skaicius tol kol bus 0");
            try {
                sk = sc.nextInt();
                if (mas.length<=kiek){
                    //masyva padidinam per viena vieta
                    mas=Arrays.copyOf(mas, mas.length+1);
                }
                mas[kiek++]=sk;
            }catch (InputMismatchException e){
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                sc.nextLine(); //kartoja ivedima
                //sk prilygina 0 ir programa baigia darba
                //sk=0;
            }


        }while (sk!=0);
        System.out.println("Suma yra: "+ masSuma(mas));
    }

    public static int masSuma (int [] masyvas){
        int sum=0;
        for (int m:masyvas){
            sum+=m;
        }


        return sum;
    }

}
