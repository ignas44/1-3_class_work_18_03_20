import java.util.Arrays;

public class uzdavinys6 {
    public static void main(String[] args) {
        String [] smas= {"1","2","3","4"};
        String [] rmas= {"a","b","c","d"};
        // isspausdina visa masyva be for ciklo
        System.out.println(Arrays.toString(mGrazina(smas, rmas)));
    }
    public static String[] mGrazina(String[]masyvas1, String[] masyvas2){
        String[] masyvas3= new String[masyvas1.length+masyvas2.length];
        int a=0;
        int b=1;
        // i zingsnis kas 2 yra i=i+2;
        for (int i=0;i<masyvas1.length;i++){
            masyvas3[a]=masyvas1[i];
            masyvas3[b]=masyvas2[i];
            a=a+2;
            b=b+2;
        }
        return masyvas3;

    }
}
