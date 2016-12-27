//UnOrderedListA.java
//cs111 sample API  usage of list for an
//unordered list using the ArrayList



import java.util.ArrayList;
import java.util.Scanner;

public class UnOrderedListA
{

    public static void DisplayList(ArrayList<String> l)
    {
	
	int numItems=l.size();
	for (int i =0; i<numItems;i++)
	    { //get the next item of the list
		String item = l.get(i);
		System.out.println(item);
	    }
    }

    public static void main(String [] args)
    {
	ArrayList <String> l = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	String name;

	System.out.println ("enter a name, CRTL D to end ");
	while (sc.hasNext())
	    { name = sc.next();
	    //insert at the end of the list
		if (!l.contains(name))
		    l.add(0, name);
		System.out.println("enter a name, CTRL D to end ");
	    }

	System.out.println("the list contains: ");
	DisplayList(l);

    }
}
