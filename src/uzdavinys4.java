import java.util.Scanner;

public class uzdavinys4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");
        int [] mas= new int [5];
        for (int i =0; i<mas.length; i++){
            mas[i]=sc.nextInt();
        }
        for (int a:mas){
            System.out.print(a + " ");
        }
        System.out.println(suma(mas));
    }
    public static int suma(int [] masyvas){
        int sum=0;
        for (int m:masyvas){
            sum+=m;
        }
        return sum;
    }
}
