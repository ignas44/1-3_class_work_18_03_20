import java.util.Scanner;

public class uzdavinys5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");
        String [] mas = new String[5];
        for (int i =0; i<5;i++){
            mas[i]=sc.next();

        }
        for (String m:mas){
            System.out.print(m + " ");
        }
    }
}
