import java.util.Scanner;

public class uzdavinys8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zodis = "";


        while (true) {
            System.out.println("Iveskite zodi");
            zodis = sc.nextLine();
            System.out.println("Ivestas zodis: " + zodis);
            if (zodis.toLowerCase().equals("pabaiga")) {
                break;
            }
            if (zodis.length() % 2 == 0) {
                System.out.println("Ivestas zodis " + zodis + "yra lyginis, jo ilgis: " + zodis.length());
            } else {
                System.out.println("Ivestas zodis " + zodis + "yra nelyginis, jo ilgis" + zodis.length());
            }
            char letter='a';
            System.out.println("Radome raidziu "+letter+" raidziu "+ suskaiciuojaKiekARaidziu(zodis, letter));
            //pavercia mazosiomis raidemis

        }
    }


    public static int suskaiciuojaKiekARaidziu(String zodis, char letter) {
        int sum = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.charAt(i) == letter) {
                sum++;
            }

        }
        return sum;
    }

}