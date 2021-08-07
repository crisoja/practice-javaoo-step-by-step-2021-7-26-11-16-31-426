package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce() {
        String intro = super.introduce() + " I am a Teacher. ";

        if (klass != null) {
            intro += "I teach " + klass.getDisplayName() + ".";
        } else {
            intro += "I teach No Class.";
        }

        return intro;
    }

    public String introduceWith(Student student) {

        String intro = super.introduce() + " I am a Teacher. I ";

        if (klass.getNumber() == student.getKlass().getNumber()) {
            return intro += String.format("teach %s.",student.getName());
        }

        return intro += String.format("don't teach %s.",student.getName());
    }
}