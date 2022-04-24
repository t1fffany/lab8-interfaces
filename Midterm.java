import java.util.*;
public class Midterm implements Measurable, Comparable<Midterm>  {
    private double score;
    private String studentName;

    public Midterm(){
        this.score= 0;
        this.studentName="student";
    }

    public Midterm( String name, double points){
        this.score= points;
        this.studentName= name;
    }

    public String toString(){
        String words= (studentName+ " "+ score);
        return words;
    }

    public double getMeasurement()
    {
        return this.score;
    }

    public int compareTo(Midterm m){
        if (this.getMeasurement()<m.getMeasurement())
            return -1;
        else if(this.getMeasurement()>m.getMeasurement())
            return 1;
        else return 0;
    }

}
