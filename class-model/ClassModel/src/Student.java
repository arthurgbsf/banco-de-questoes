public class Student {

    private final int id;
    private String name;
    private double avg;

    public Student(int id, String name, double avg){
        this.id = id;
        this.name = name;
        this.avg = avg;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAvg(double avg){
        this.avg = avg;
    }

    public double getAvg(){
        return avg;
    }

    public int getId(){
        return id;
    }

}
