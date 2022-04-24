import java.util.*;
public class Country implements Measurable, Comparable<Country>  {
    private String countryName;
    private double surfaceArea;

    public Country(){
        this.countryName="USA";
        this.surfaceArea=10.5;
    }
    public Country(String name, double space){
        this.countryName= name;
        this.surfaceArea= space;
    }

    public double getMeasurement() {
        return this.surfaceArea;
    }

    public int compareTo(Country c){
        if (this.getMeasurement()<c.getMeasurement())
            return -1;
        else if(this.getMeasurement()>c.getMeasurement())
            return 1;
        else return 0;
    }
    public String toString(){
        String words= (countryName+ " "+ surfaceArea);
        return words;
    }

}
