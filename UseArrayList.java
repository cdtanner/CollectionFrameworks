import java.util.ArrayList;

public class UseArrayList
{
    public static void main (String args[])
    {
	ArrayList <String> grocery = new ArrayList<String>();
	ArrayList <Double> temps = new ArrayList<Double>();

	grocery.add("lemons");
	grocery.add("tomatoes");
	grocery.add("steak");
	grocery.add("chicken");

	for (int i =0; i<4; i++)
	    System.out.println(grocery.get(i));

    }
}