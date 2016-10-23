import java.util.ArrayList;

public class Josephus
{   
	//Create 2 ArrayLists, one a remover and one the master list
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> remover = new ArrayList<Integer>();
    
	//Defines the master list
	public Josephus(int numPersons)
    {
        for (int i = 1; i <= numPersons; i++)
        {
        	list.add(i);
        }
    }

    // Remove every increment person from the list
    // Return the remaining person at the end
    public String lastPersonStanding(int increment)
    {   
    	int run = 0;
        while (list.size() > 1)
        {
        	for (int num : list)
        	{
        		run++;
        		if (run == increment)
        		{
        			remover.add(num);
        			run = 0;
        		}
        	}
        	while (remover.isEmpty() == false)
        	{
        		list.remove(remover.get(0));
        		remover.remove(0);
        	}
        	
        }
    	return Integer.toString(list.get(0));
    }
}
