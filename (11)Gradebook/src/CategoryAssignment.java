/****************************************************
**
** CategoryAssignment class
**
** This class represents an CategoryAssignment. 
** Do not add any additional methods to this class.
**
****************************************************/
public class CategoryAssignment extends Assignment {
    private String categoryName;
    
    // CategoryAssignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values.     
    public CategoryAssignment (String n, double ptsPoss, double ptsEarned, String cat) {
        super(n, ptsPoss, ptsEarned);
        categoryName = cat;
    }
    
    // getCategoryName accessor method
    //
    // postcondition: returns the name of the category associated
    // with this CategoryAssignment
    public String getCategoryName() {
        return categoryName;
    }
}
