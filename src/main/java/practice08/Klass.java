package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }

    private List<Student> members;


    public Klass(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return String.format("Class %s",number);
    }

    public void assignLeader(Student leader) {
        if (members != null && members.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members = new ArrayList<>();
        members.add(student);

    }

}