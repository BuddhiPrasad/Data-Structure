
public class LinkedList 
{
	Node head;
	
	public void insert(int data)
	{
		//Node node = new Node();
		//node.data = data;
		//node.nextnode = null;
		
		//if(head==null)//looking head node is null
		//{
		//	head = node; //is null assign the node value as head node
		//}
		//else
		//{
		//	Node n = head; //creating tempory node call "n"
		//	while (n.nextnode!=null) //looking for null value(traveling to find null value)
		//	{
		//		n = n.nextnode;
		//	}
		//	n.nextnode = node;
		//}
		
		
		Node node = new Node();
		node.data = data;
		node.nextnode = null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.nextnode!=null)
			{
				n = n.nextnode;
			}
			n.nextnode = node;
		}
			
		
		
	}
	
	public void insertstart(int data) //insert node into start
	{
		//Node node = new Node();
		//node.data = data;
		//node.nextnode = null;
		//node.nextnode = head;
		
		//head = node;
		
		
		Node node = new Node();
		node.data = data;
		node.nextnode = null;
		node.nextnode = head;
		
		head = node;
		
	}
	
	public void insertAt(int index,int data) //insert node in between
	{
		//Node node = new Node();
		//node.data = data;
		//node.nextnode = null;
		
		//if(index == 0)
		//{
		//	insertstart(data);
		//}
		//else
		//{
		//	Node n = head;
		//	for(int i=0;i<index-1;i++)
		//	{
		//		n = n.nextnode;
		//	}
		//	node.nextnode = n.nextnode;
		//	n.nextnode = node;
		//}
		
		Node node = new Node();
		node.data = data;
		node.nextnode = null;
		
		if(index == 0)
		{
			insertstart(data);
		}
		else
		{
			Node n = head;
			for(int i= 0;i<index-1;i++)
			{
				n = n.nextnode;
			}
			node.nextnode = n.nextnode;
			n.nextnode = node;
		}
		
	}
	
	public void deletAt(int index) 
	{	
		if(index == 0)
		{
			head = head.nextnode;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.nextnode;
			}
			n1 = n.nextnode;
			n.nextnode = n1.nextnode;
			System.out.println("n1" + n1.data);
		}
		
	}
	
	public void show ()
	{
		Node node = head;
		while(node.nextnode!=null)
		{
			System.out.println(node.data);
			node = node.nextnode;
		}
		System.out.println(node.data);
	}
}
