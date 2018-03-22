public class uzdavinys7 {
    public static void main(String[] args) {
        int [][] masyvas= new int [2][2];
        masyvas[1][1]=1;
        masyvas[1][2]=-1;
        masyvas[2][1]=3;
        masyvas[2][2]=-2;
        int sum=0;
        for (int i =0; i<2;i++){
            for (int j=0;j<2;j++){
                if (masyvas[i][j]>0){
                    sum+=1;
                }
            }
        }

    }
}
