package lt.gerasimovas.teorijaiPasikartoti.equal_and_hashCode;

import java.util.Objects;

public class Person {
    private String name;
    private String gender;
    private static long personCount = 0;
    private long id = 0;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        id += personCount;
        personCount++;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()){
//            return false;
//        }
//
//        Person person = (Person) obj;
//
//         return name.equals(person.getName()) && gender.equals(person.getGender());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }

    public native String getSystemTime();


}
