package practice05;

public class Teacher extends Person{
    private String name;
    private int age;
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name,age);
        this.name = name;
        this.age = age;
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
        String intro = "";
        if(klass == null)
            intro =  super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        else
            intro = super.introduce() + String.format(" I am a Teacher. I teach Class %d.",klass);

        return  intro;
    }
}