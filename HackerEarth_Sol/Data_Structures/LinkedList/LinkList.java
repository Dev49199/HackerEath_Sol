// Implementation of Singly linklist in Java
// This program implement Singly link list in java
// performs operation : add node at tail, delete from specific position and printlist
// On deletion if position is greater than #elements then last element will be deleted.
import java.util.*;


class Node{
	int data;
	Node next;
}


public class LinkList
{
	static Node head;
	public static void createList(int data)
	{
		Node temp;
		if(head==null)
		{
			temp = new Node();
			temp.data = data;
			temp.next = null;
			head = temp; 
		}
		else
		{
			temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			Node newTemp = new Node();
			newTemp.data=data;
			newTemp.next=null;
			temp.next = newTemp;
		}
	}

	public static void deleteList(int pos)
	{
		Node temp = head;
		int i=1;

		if(pos==1)
		{
			head = head.next;

		}
		else
		{	
		while(i<pos-1 && temp.next!=null)
		{
			temp=temp.next;
			i++;
		}

		if(temp.next==null)
		{
			temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		else
		{
			temp.next = temp.next.next;
		}
	}
}
	public static void printList()
	{
		Node temp = head;
		System.out.println("Printing starts..");
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}
	public static void main(String[] args)
	{
		int option,data;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("\nEnter the choice:\n");
		System.out.print("1.createlist\n2.printlist\n3.Delete a node\n4.Exit\n");
		option = sc.nextInt();
		if(option==1)
		{
			System.out.println("Add element");
			data = sc.nextInt();
			createList(data);
		}
		else if(option==2)
		{
			printList();
		}
		else if(option==3)
		{
			System.out.println("enter the position to delete");
			data = sc.nextInt();
			deleteList(data);
		}
		else
		{
			break;
		}

	}
}
}