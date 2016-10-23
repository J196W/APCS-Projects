import java.util.ArrayList;


public class CusJos {
	
	//Creates 2 Array Lists, one a remover and one the master
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> remover = new ArrayList<Integer>();
    
	
	//Defines the master list
	public CusJos(int numPersons)
    {
        for (int i = 1; i <= numPersons; i++){
        	list.add(i);
        }
    }

    // Remove every increment person from the list
    // Return the remaining person at the end
    public String lastPersonStanding(int increment)
    {   
    	String exp = "";
    	int run = 0;
        while (list.size() > 1){
        	for (int num : list){
        		run++;
        		if (run == increment){
        			remover.add(num);
        			run = 0;
        		}
        	}
        	while (remover.isEmpty() == false){
        		exp += " " + remover.get(0);
        		list.remove(remover.get(0));
        		remover.remove(0);
        	}
        	
        }
        
        //Outputs not only the correct survivor but the order in which the survivors are killed
    	return Integer.toString(list.get(0)) + "\nOrder of deaths : " + exp + " " +Integer.toString(list.get(0));
    }
}

