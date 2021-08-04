package practice07;

public class Klass {
    private Integer number;
    private Student student;

    public Klass(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        this.student = student;
    }

    public Student getLeader(){
        return student;
    }

    public String getDisplayName(){
        return String.format("Class %d",number);
    }
}
