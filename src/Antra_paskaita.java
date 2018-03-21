import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Antra_paskaita {
    public static void main(String[] args) {
        //nuskaityti is konsoles
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite skaiciu");
        int numb = sc.nextInt();
        if (numb % 2 == 0) {
            System.out.println(numb + "yra lyginis");
        } else {
            System.out.println(numb + "yra nelyginis");
        }
        ///ctrl+alt+l suformatuoja koda, sulygiuoja graziai
    }


}
