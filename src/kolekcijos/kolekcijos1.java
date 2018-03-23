package kolekcijos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class kolekcijos1 {
    public static void main(String[] args) {
        ArrayList <String> vardai= new ArrayList<>();
        List<Integer> numeriai = new ArrayList<>();
        vardai.add("Andrius");
        vardai.add("Petras");
        vardai.add("Andrius");
        vardai.add("Petras");
        vardai.add("Andrius");
        vardai.add("Petras");

        for (String zodis:vardai){
            System.out.println(zodis);

        }
        System.out.println(vardai.size()); //listo dydis
        System.out.println(vardai.isEmpty());  //paziuri ar tuscias listas
        System.out.println(vardai.get(1));    //isveda 1 reiksme liste
        numeriai.add(7,12);
       // numeriai.add(2,12);   ideda i listo antra indeksa
        numeriai.add(15);
        numeriai.add(12,19);
        numeriai.add(9);
        Collections.sort(numeriai);
        Collections.reverse(numeriai);   // apvercia lista atvirksciai

        numeriai.forEach(System.out::println);  //atspausdina visa lista i atskiras eilutes
        vardai.forEach(a-> System.out.println("index"+vardai.indexOf(a)+" reiksmes"+a)); //  paroso rastu objekta indekso reiksme

    }
}
