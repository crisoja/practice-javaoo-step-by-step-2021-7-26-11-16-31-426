package practice10;


public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String intro = super.introduce() + " I am a Student. ";
        if (!this.equals(klass.getLeader())) {
            return intro += String.format("I am at %s.", klass.getDisplayName());
        }

        intro += String.format("I am Leader of %s.", klass.getDisplayName());
        return intro;
    }

}
