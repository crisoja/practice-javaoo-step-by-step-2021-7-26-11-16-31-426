package practice09;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private Klass klass;
    private LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.klass = klass;
        this.linkedList = linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce() + " I am a Teacher. ");

        if (linkedList != null) {
            introduce.append("I teach Class ");
            for (Klass klass : linkedList) {
                int i;
                introduce.append(klass.getNumber());
                if (klass != linkedList.getLast()) {
                    introduce.append(", ");
                }
            }

            introduce.append(".");
        } else {
            introduce.append("I teach No Class.");
        }

        return introduce.toString();
    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
    }

    public String introduceWith(Student student) {

        List<Klass> newLinked = new LinkedList();
        String intro = super.introduce() + " I am a Teacher. I ";
        newLinked =linkedList.stream().filter(klass->klass.getNumber()==student.getKlass().getNumber()).collect(Collectors.toList());

        if(!newLinked.isEmpty()){
            return intro += String.format("teach %s.",student.getName());
        }

        return intro += String.format("don't teach %s.",student.getName());

    }

}