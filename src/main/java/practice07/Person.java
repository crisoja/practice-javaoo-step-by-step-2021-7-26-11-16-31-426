package practice07;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private Klass klass;
    private final int number;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name, int age,int klass) {
//        this.klass = klass;
//        this.name = name;
//        this.age = age;
//    }
     public Person(int number,String name, int age){
         this.number = number;
         this.name = name;
         this.age = age;
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() { return klass;}

    public String introduce(){
        return  String.format("My name is %s. I am %d years old.",name,age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && klass == person.klass && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, klass);
    }
}
