package practice06;

public class Klass {
    private Integer number;

    public Klass(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return String.format("Class %d",number);
    }
}
