package practice05;

public class Student extends Person{
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        return  super.introduce() + String.format(" I am a Student. I am at Class %d.",klass);
    }

}
