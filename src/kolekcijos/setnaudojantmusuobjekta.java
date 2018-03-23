package kolekcijos;

import java.util.Objects;

public class setnaudojantmusuobjekta {
    private String Name;
    private String Surname;

    public setnaudojantmusuobjekta(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        setnaudojantmusuobjekta that = (setnaudojantmusuobjekta) o;
        return Objects.equals(Name, that.Name) &&
                Objects.equals(Surname, that.Surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Name, Surname);
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }
}
