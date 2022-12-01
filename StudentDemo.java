/**
This program is hardcoded with various students. Their GPA is then calculated and sorted via rank or level of distinction
StudentDemo applies concepts such overloading and class inheritance, arrays, arrayLists, loops and others.
 */

package studentdemo;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentDemo {

    Student myStudents[] = new Student[6];
    /**
    Description:  This is main, its where the magic happens. It instantiates itself then executes the 3 methods.
    @param args
    @return N/A
    @throws N/A
     */
    public static void main(String[] args) 
    {
        StudentDemo myDemo = new StudentDemo();
        myDemo.createStudents();
        myDemo.computeGPA();
        myDemo.summarizeTotals();
    }
    /*
    Description:  This hardcodes the students into the program. The grades are put into an arrayList and 
    the students are put into an array.
    @param n/a
    @return n/a
    @throws n/a
    */
    public void createStudents()
    {
        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(100.0); array1.add(97.5); array1.add(95.4); array1.add(96.9); array1.add(88.7); 
        myStudents[0] = new K12Student("Stud1", "Mary", "Cristy", "Charters", array1, 3);
        
        ArrayList<Double> array2 = new ArrayList<Double>();
        array2.add(78.0); array2.add(88.5); array2.add(85.4); array2.add(76.9); array2.add(78.7);
        myStudents[1] = new K12Student("Stud2", "Joe", "Jake", "Smith", array2, 8);
        
        ArrayList<Double> array3 = new ArrayList<Double>();
        array3.add(68.0); array3.add(58.5); array3.add(55.4); array3.add(66.9); array3.add(68.7);
        myStudents[2] = new K12Student("Stud3", "Tom", "Tim", "Jones", array3, 10);
        
        ArrayList<Double> array4 = new ArrayList<Double>();
        array4.add(89.0); array4.add(90.5); array4.add(95.4); array4.add(86.9); array4.add(88.7);
        myStudents[3] = new CollegeStudent("Stud4", "Sonia", "Maria", "Gonzalez", array4, 2);
        
        ArrayList<Double> array5 = new ArrayList<Double>(); 
        array5.add(99.0); array5.add(98.5); array5.add(95.4); array5.add(96.9); array5.add(98.7);
        myStudents[4] = new CollegeStudent("Stud5", "Jorge", "Raul", "Hernandez", array5, 3);
        
        ArrayList<Double> array6 = new ArrayList<Double>(); 
        array6.add(94.0); array6.add(96.5); array6.add(95.4); array6.add(94.9); array6.add(98.7);
        myStudents[5] = new CollegeStudent("Stud6", "Jim", "Randy", "Roget", array6, 4);
    }
    
    /*
    Description:  Calculates the GPA by iterating through the entire array of Student objects.
    It also polymorphically calls the calculateGPA() method for each of the objects.
    @param N/A
    @return N/A
    @throws N/A
    */
    public void computeGPA()
    {
        for(int i = 0; i < myStudents.length; i++)
        {
            myStudents[i].calculateGPA();
        }
       
    }
    /*
    Description: Prints out the total number of college students created and the total number of K12 students.
    @param N/A
    @return N/A
    @throws N/A
    */
    public void summarizeTotals()
    {
        System.out.println("Amount of college students: " + CollegeStudent.getCollegeStudentCount() + ".");
        System.out.println("Amount of K12 Students: " + K12Student.getK12StudentCount() + ".");
        
        for(int i = 0; i < myStudents.length; i++)
        {
            System.out.println(myStudents[i]);
        }
    }
}
        
        
        
   
