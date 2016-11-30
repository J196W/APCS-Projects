/****************************************************
**
** Assignment class
**
** This class represents an Assignment. 
**
****************************************************/
public class Assignment {
    private String name;
    private double pointsPossible;
    private double pointsEarned;

    // Assignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values. 
    public Assignment (String n, double ptsPoss, double ptsEarned) {
    	name = n;
    	pointsPossible = ptsPoss;
    	pointsEarned = ptsEarned;
    }
    
    // getName accessor method
    //
    // postcondition: returns the name of this Assignment
    public String getName() {
        return name;
    }
    
    // getPointsPossible accessor method
    //
    // postcondition: returns the points possible for this Assignment
    public double getPointsPossible() {
        return pointsPossible;
    }
    
    // getPointsEarned accessor method
    //
    // postcondition: returns the points earned for this Assignment
    public double getPointsEarned() {
        return pointsEarned;
    }
}
