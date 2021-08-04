package practice06;

public class Teacher extends Person{
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
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

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        String intro = "";
        if(klass == null)
            intro =  super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        else
            intro = super.introduce() + String.format(" I am a Teacher. I teach Class %d.",klass.getNumber());

        return  intro;
    }

    public String introduceWith(Student student){
        String intro= "";
        if(this.klass.getNumber() == student.getNumber()) {
           intro = super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
        else {
            intro = super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        }
        return intro;
    }
}



















