/**
This is the Student class. It has the getters, setters and the toString. Standard stuff.
 */
package studentdemo;
import java.util.ArrayList;

public abstract class  Student implements StudentCalculations  {
    
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private ArrayList<Double> grades;
    
    public Student(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades)
    {
        id = anId;
        firstName = aFirstName;
        middleName = aMiddleName;
        lastName = aLastName;
        grades = new ArrayList<>(aListOfGrades);
    }
    /*
    Getters, setters and the toString method. Standard stuff really.
    */
    public String getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getMiddleName()
    {
        return middleName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public ArrayList getGrades()
    {
        return grades;
    }
    
    public void setId(String anId)
    {
        id = anId;
    }
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    
    public void setMiddleName(String aMiddleName)
    {
        middleName = aMiddleName;
    }
    
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
    public void setGrades(ArrayList aListOfGrades)
    {
        grades = aListOfGrades;
    }
    
    public String toString()
    {
        return id + " - " + firstName + " " + middleName + " " + lastName + ". ";
    }
    
    /**
    Description:  This is the calculateGPA. It is an abstract method, which forces the classes under to use this method. I defined this method 
    concretely in the sub-classes.
    @param N/A
    @return N/A
    @throws N/A
     */
    public abstract double calculateGPA();
    /**
    Description:  This is an abstract method that must be coded "concretely" in each of the subclasses.
    @param N/A
    @return N/A
    @throws N/A
     */
    @Override
    public abstract int calculateYearsLeft();
    }
