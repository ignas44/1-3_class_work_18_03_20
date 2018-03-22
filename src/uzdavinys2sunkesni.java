import java.util.Scanner;

public class uzdavinys2sunkesni {
    public static void main(String[] args) {
        // pakeitimas a=a.replaceAll(" ", "");
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String zodis= sc.nextLine();
        arSutampa(zodis);

    }
    public static void arSutampa(String zodis){
        int j = zodis.length();
        //pakeicia zodyje ka nori
        zodis=zodis.replaceAll(" ", "");

       for (int i=0; i<zodis.length();i++){
           //eina per raides ir skaito simbolius atskirai

           char pradzia=zodis.charAt(i);
           char galas=zodis.charAt(zodis.length()-1-i);
           if (pradzia!=galas) {
               System.out.println("nepolindromas");
               break;
           }else {
              if(i==zodis.length()-1) {
                  System.out.println("polindromas");
              }
           }
       }


    }
}
