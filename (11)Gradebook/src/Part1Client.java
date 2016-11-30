/****************************************************
**
** Client class for Part 1
**
** This class is a Gradebook client, and is used
** to test the TotalPointsGradebook and Assignment
** classes.
**
** After you determine that your Assignment and 
** TotalPointsGradebook classes work properly by 
** testing them with this program, you can modify this
** program to calculate other sets of grades. For example,
** do you have a class in school that uses the total
** points grading system, and in which you know your
** grades? You can use your own data to test your
** TotalPointsGradebook and Assignment classes!
**
****************************************************/
public class Part1Client {
    public static void main(String[] args) {
        // This code is used to test the Assignment class. 
        // Run this code first. 
        Assignment assign = new Assignment("Lab 1", 10, 9);
        
        // this should print Lab 1
        System.out.println("Name of assign = " + assign.getName()); 
        
        // this should print 10
        System.out.println("Points possible = " + assign.getPointsPossible()); 
        
        // this should print 9
        System.out.println("Points earned = " + assign.getPointsEarned());
        
        
        TotalPointsGradebook gradebook = new TotalPointsGradebook();
        gradebook.add(assign);
        gradebook.add(new Assignment("Lab 2", 10, 10));
        gradebook.add(new Assignment("Lab 3", 10, 8));
        gradebook.add(new Assignment("Lab 4", 15, 13));
        gradebook.add(new Assignment("Quiz 1", 5, 5));
        gradebook.add(new Assignment("Quiz 2", 5, 4));
        gradebook.add(new Assignment("Quiz 3", 5, 5));
        gradebook.add(new Assignment("Test 1", 50, 46));
        gradebook.add(new Assignment("Test 2", 50, 42));
        gradebook.add(new Assignment("Final Exam", 50, 43));
        
        System.out.println("Grade = " + gradebook.calculateGrade());        
        
    }
}
