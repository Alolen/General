/**
This is where I create the K12 student. I also calculate the GPA and set their rank accordingly.
 */

package studentdemo;
import java.util.ArrayList;
/**
 *
 * @author Owner
 */
public class K12Student extends Student {
    
    private int yearInK12School;
    private double rank;
    private static int k12StudentCount;
    
    /*
    Description: Calls the super-class constructor and increments the k12StudentCount counter.
    @param anId, aFirstName, aMiddleName, aLastName, aListOfGrades, aYearInK12School
    @return getters do the returning.
    @throws N/A
     */
    public K12Student(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInK12School)
    {
       super(anId, aFirstName, aMiddleName, aLastName, aListOfGrades);
       this.yearInK12School = aYearInK12School;
       k12StudentCount++;
    }    
    
    public void setYearInK12School(int aYearInK12School)
    {
        yearInK12School = aYearInK12School;
    }
    
    public int getYearInK12School()
    {
        return yearInK12School;
    }
    
    public void setRank(double aRank)
    {
        rank = aRank;
    }
    
    public double getRank()
    {
        return rank;
    }
    
    public static int getK12StudentCount()
    {
        return k12StudentCount;
    }
    /*
    Description: Calculates the GPA based on the myGrades array list. It also sets level of distinction based on GPA.
    @param N/A
    @return Returns x, which is the GPA, rounded to the nearest whole number. 
    @throws N/A
    */
    @Override
    public double calculateGPA()
    {
        double totalGrades = 0;
        double avgGrades;
        ArrayList<Double> myGrades = new ArrayList<Double>(getGrades());  //copy the arrayList from the instance variable to this local variable.

        for (int i = 0; i < myGrades.size(); i++)
        {
            totalGrades = totalGrades + myGrades.get(i);
        }
        avgGrades = totalGrades / myGrades.size();
        if (avgGrades >= 90)
        {
            rank = .10;
        }
        else if (avgGrades >= 80)
        {
            rank = .20;
        }
        else if (avgGrades >= 70)
        {
            rank = .30;
        }
        else if (avgGrades >= 60)
        {
            rank = .40;
        }
        else if (avgGrades >= 50 )
        {
            rank = .50;
        }
        else if (avgGrades >= 40)
        {
            rank = .60;
        }
        else if (avgGrades >= 30)
        {
            rank = .70;
        }
        else if (avgGrades >= 20)
        {
            rank = .80;
        }
        else if (avgGrades >= 10 )
        {
            rank = .90;
        }
        else if (avgGrades < 10)
        {
            rank = 1;
        }
        //return the avgGrade rounded to the nearest whole number:
        int x = (int) Math.round(avgGrades);
        return x;
        
    }
    /*
    Description: return all the values in the superclass plus the values in the subclass, referencing the superclass .toString()
    @param N/A
    @return returns a string.
    @throws N/A
    */
    @Override
    public String toString()
    {
         //return all the values in the superclass plus the values in the subclass, referencing the superclass .toString()
        return super.toString() + "Year in K12: " + yearInK12School + ". GPA: " + calculateGPA() + ". Class Rank: " + rank;
    }  
    /*
    Description: This is the method we are obligated to define in each subclass that implements the interface StudentCalculations
    @param N/A
    @return return the yearInK12School subtracted from 12, since 12 is usual number of years spent in K - 12
    @throws N/A
    */
    @Override
    public int calculateYearsLeft()
    {
        return yearInK12School - 12;
    }
    
   
}

