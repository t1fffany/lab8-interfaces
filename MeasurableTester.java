/**
   This program demonstrates the measurable Country class.
*/
import java.util.Arrays;
public class MeasurableTester
{
   public static void main(String[] args)
   {
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      Measurable maxCountry = Measurable.max(countries);
      System.out.println("Maximum area: " + maxCountry.getMeasurement());
      System.out.println("Expected: 513120");
      System.out.println("The average surface area of these countries are: "+Measurable.average(countries));

      System.out.println("List of countries");
      for (Measurable obj : countries)
         System.out.println(obj.toString());
      System.out.println();

      //Sorting countries
      Arrays.sort(countries);
      System.out.println("Sorted Countries:");
      for (Measurable obj : countries)
         System.out.println(obj.toString());

      Measurable[] midterm= new Measurable[10];
      midterm[0] = new Midterm("Tiffany", 110);
      midterm[1] = new Midterm("Dawn", 98);
      midterm[2] = new Midterm("Jamie", 95);
      midterm[3] = new Midterm("Doris", 100);
      midterm[4] = new Midterm("James", 85);
      midterm[5] = new Midterm("Jiana", 90);
      midterm[6] = new Midterm("Auston", 94);
      midterm[7] = new Midterm("Ryan", 75);
      midterm[8] = new Midterm("Drew", 98);
      midterm[9] = new Midterm("Jack", 96);

      //List of students before sorting
      System.out.println();
      System.out.println("List of students");
      for(Measurable obj: midterm) {
         System.out.println(obj.toString());
      }
      System.out.println();

      Measurable maxMidterm = Measurable.max(midterm);
      System.out.println("Average midterm score:"+ Measurable.average(midterm));
      System.out.println("The highest midterm score:"+ maxMidterm.getMeasurement());
      System.out.println();
      
      Arrays.sort(midterm);
      System.out.println("Sorted midterms:");
      for(Measurable obj: midterm) {
         System.out.println(obj.toString());
      }
   }
}
