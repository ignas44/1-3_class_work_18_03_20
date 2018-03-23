package kolekcijos;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {


        Set<Integer> vardai= new TreeSet<>();
        vardai.add(5);
        vardai.add(6);
        vardai.add(20);
        vardai.add(500);
        vardai.add(500);
        vardai.add(500);

        vardai.forEach(System.out::println);
        Set<setnaudojantmusuobjekta> person= new LinkedHashSet<>();  // naudojam seta is kitos klases
        person.add(new setnaudojantmusuobjekta("Ignas", "Samajauskas")); //sukuriam nauja objekta
        person.add(new setnaudojantmusuobjekta("Pampickiukas", "Minionas"));
        person.add(new setnaudojantmusuobjekta("Pampickiukas", "Minionas"));

        person.forEach(p->{
            System.out.println("Vardas "+p.getName()+" pavarde "+p.getSurname());
        });



    }
}
