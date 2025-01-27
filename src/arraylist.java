import java.util.*;
public class arraylist {
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(2);
		Collections.sort(list);
		if(list.contains(4))
		{
			System.out.println("Yes");
		}
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
	}
}
