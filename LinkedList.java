import java.util.*;
class Node
{
	int data;
	Node next;
}
public class Runner
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		
		list.inserAtStart(50);
		
		list.inserAt(0,77);
		list.inserAt(3,88);
		
		list.deleteAt(4);
		
		list.show();
		
	}
	
}
class LinkedList
{
	Node head;//refer to the first node
	public void insert(int d)
	{
		Node node = new Node();
		node.data = d;
		node.next=null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;//temporary node, and this rfers to first node.
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void inserAt(int index, int d)
	{
		Node node = new Node();
		node.data = d;
		node.next = null;
		
		if(index == 0)
		{
			inserAtStart(d);
		}
		else
		{
			Node n = head;
			for(int i=0; i<index-1; i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
			
	}
	
	public void inserAtStart(int d)
	{
		Node node = new Node();
		node.data = d;
		node.next = null;
		
		node.next = head;
		head = node;
		
	}
	
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0; i<index-1; i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data +" ");
			node = node.next;
		}
		System.out.print(node.data);
		
	}
	
	
	
	
}