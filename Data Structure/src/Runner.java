
public class Runner {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(55);
		list.insert(25);;
		list.insert(84);
		
		list.insertstart(25);
		list.insertAt(0, 2);
		
		list.deletAt(1);
		
		list.show();
	}

}
