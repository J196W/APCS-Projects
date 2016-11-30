/****************************************************
**
** TotalPointsGradebook class
**
** This class represents a Gradebook that calculates
** grades according to the total points grading system.
**
****************************************************/
import java.util.ArrayList;

public class TotalPointsGradebook implements Gradebook {
    private ArrayList<Assignment> myGrades;
    
    // TotalPointsGradebook constructor
    //
    // postcondition: myGrades is instantiated
    public TotalPointsGradebook() {
    	myGrades = new ArrayList<Assignment>();
    }
    
    // add mutator method
    //
    // postcondition: the given Assignment object is added to myGrades
    // hint: use the add method in the ArrayList class
    public void add(Assignment assign) {
    		myGrades.add(assign);
    }
    
    // calculateGrade accessor method
    //
    // postcondition: the grade represented by myGrades is calculated and
    // returned, according to the total points grading system. The value is
    // the sum of the points earned on all Assignments in this Gradebook, 
    // divided by the sum of the points possible on all Assignments in 
    // this Gradebook, and is converted to a value between 0 and 100, 
    // inclusive. 
    // 
    // hints: 
    // Step 1: declare and initialize int variables for the sum of the points
    // available and the sum of the points earned. 
    // Step 2: put "Assignment assign;" at the top (without the quotes)
    // Step 3: write a for loop that will loop through all elements of myGrades
    // Step 4: in your loop, invoke the get method from the ArrayList class to
    // get the current element in myGrades, and store it in assign
    // Step 5: in your loop, invoke the getPointsEarned method using assign, and
    // add the value returned to your sum of points earned
    // Step 6: in your loop, invoke the getPointsPossible method using assign, and 
    // add the value returned to your sum of points earned
    // Step 7: after your loop, divide your sum of points earned by your sum of 
    // points possible, multiply that value by 100, and return it
    public double calculateGrade() {
    	double totalPts = 0.0;
        double totalEar = 0.0;
        for (Assignment assign : myGrades){
        	totalPts += assign.getPointsPossible();
        	totalEar += assign.getPointsEarned();
        }
        return (totalEar / totalPts) * 100;
    }
}
