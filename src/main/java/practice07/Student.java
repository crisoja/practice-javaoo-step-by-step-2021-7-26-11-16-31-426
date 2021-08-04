package practice07;

import java.util.Objects;

public class Student extends Person{
    private String name;
    private int age;
    private Klass klass;
    private int number;



    public Student(int number, String name, int age, Klass klass) {
        super(number,name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.number = number;
    }

    public Klass getKlass() {
        return klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Integer getNumber(){
        return klass.getNumber();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return age == student.age && number == student.number && Objects.equals(name, student.name) && Objects.equals(klass, student.klass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, klass, number);
    }

    @Override
    public String introduce(){
        return  super.introduce() + String.format(" I am a Student. I am at Class %h.",klass.getNumber());
    }

}

//
//    public Student(int i, String jerry, int i1, Klass klass) {