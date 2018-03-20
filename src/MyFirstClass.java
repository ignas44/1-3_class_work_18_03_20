public class MyFirstClass {
    ///psvm sukurti greitai main metoda
    public static  void  main(String[] ags){

        ///sout atspausdinimui
        System.out.println("Hello world");
        /// sukurtas objektas
        MyFirstClass myFirstClass=new MyFirstClass();
        int a=10;
        ///nestatinis metodo iskvietimas
        myFirstClass.myNotStaticMethod(a);
        ///statinis metodo iskvietimas
        myStaticMethod();
        float b=4.6f;
        double c =2.4;
        boolean d= true; //defoult false
        char e= 'a';
        String f= "this is string"; // String naudojama is didziosios raides
}
private void myNotStaticMethod(int numb){
    System.out.println("Jusu skaicius" +numb);
}
private static void myStaticMethod(){
    System.out.println("Cia yra statinis metodas");
}

}
