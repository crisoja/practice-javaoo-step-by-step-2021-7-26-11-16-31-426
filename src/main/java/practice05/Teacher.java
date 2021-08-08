package practice05;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name,age);
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