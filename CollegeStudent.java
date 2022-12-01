/**
This is where I create the College student. I also calculate the GPA and set their level of distinction accordingly.
 */

package studentdemo;
import java.util.ArrayList;

public class CollegeStudent extends Student  {
    
    //These instance variables are in addition to the inherited instance variables of the Student superclass:
    private int yearInCollege;
    private String levelOfDistinction;
    private static int collegeStudentCount;
   
    /*
    Description: Calls the super-class constructor and increments the k12StudentCount counter.
    @param anId, aFirstName, aMiddleName, aLastName, aListOfGrades, aYearInCollege
    @return getters do the returning.
    @throws N/A
    */
    public CollegeStudent(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInCollege)
    {
       super(anId, aFirstName, aMiddleName, aLastName, aListOfGrades);
       this.yearInCollege = aYearInCollege;
       collegeStudentCount++;
    }    
    //getters and setters
    public void setYearInCollege(int aYearInCollege)
    {
        yearInCollege = aYearInCollege;
    }
    
    public int getYearInCollege()
    {
        return yearInCollege;
    }
    
    public void setLevelOfDistinction(String aLevelOfDistinction)
    {
        levelOfDistinction = aLevelOfDistinction;
    }
    
    public String getLevelOfDistinction()
    {
        return levelOfDistinction;
    }
    
    public static int getCollegeStudentCount()
    {
        return collegeStudentCount;
    }
    /*
    Description: Uses a for loop to accumulate al lgrades and calculates the average. It also sets rank based on GPA.
    @param N/A
    @return Returns x, which is the GPA, rounded to the nearest whole number. 
    @throws N/A
    */
    @Override
    public double calculateGPA()
    {
        double totalGrades = 0;
        double avgGrade;
        ArrayList<Double> myGrades = new ArrayList<Double>(getGrades());  //copy the arrayList from the instance variable to this local variable.

        for (int i = 0; i < myGrades.size(); i++)
        {
            totalGrades = totalGrades + myGrades.get(i);
        }
        avgGrade = totalGrades / myGrades.size();
        int x = (int) Math.round(avgGrade); //this had to rounded first to get the input profe wanted. Let her know, it may confuse other students.
        if (x >= 98)
        {
            levelOfDistinction = "summa cum laude";
        }
        else if (x >= 95)
        {
            levelOfDistinction = "magna cum laude";
        }
        else if (x >= 90)
        {
            levelOfDistinction = "cum laude";
        }
        else if (x < 90)
        {
            levelOfDistinction = "";
        }
        //return the avgGrade after you have rounded it to the nearest whole number
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
       return super.toString() + "Year in college: " + yearInCollege + ". GPA: " + calculateGPA() + ". Level of distinction: " + levelOfDistinction + ".";
    }      
    
    /*
    Description: This is the method we are obligated to define in each subclass that implements the interface StudentCalculations.
    @param N/A
    @return the yearInCollege subtracted from 4, since 4 is usual number of years spent in college to get a bachelor's degree.
    @throws N/A
    */
   public int calculateYearsLeft()
    {
        return yearInCollege - 4;
    }
   
   
}

    

