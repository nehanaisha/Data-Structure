package linkedList;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class List{
	
	Node head;
	public static void main(String[] args) {
		List obj = new List();
		obj.create();
		obj.add();
		obj.append1();
		obj.insert();
		obj.delete();
	}
		void create() {
			LinkedList<Integer> number = new LinkedList<>();
			
		number.add(56);
		number.add(30);
		number.add(70);
		System.out.println("linkedlist: " + number);
	}
		void add() {
			LinkedList<Integer> num = new LinkedList<>();
			
			num.add(70);
			System.out.println("the number added to the list is: " + num);
			num.add(0,30);
			System.out.println("the number added to the list is: " + num);
			num.add(0,56);
			System.out.println("the number added to the list is: " + num);
			System.out.println("the final list is: " + num);
				
		}
//		public void printList()
//	    {
//	        Node tnode = head;
//	        while (tnode != null)
//	        {
//	            System.out.print(tnode.data+" ");
//	            tnode = tnode.next;
//	        }
//	    }
		void append1() {
			LinkedList<Integer> num1 = new LinkedList<>();
			num1.add(56);
			System.out.println("the number added to the list is: " + num1);
			num1.addLast(30);
			System.out.println("the append number is : " + num1);
			num1.addLast(70);
			System.out.println("the final list is : " + num1);
			
		}
		void insert() {
			LinkedList<Integer> num2 = new LinkedList<>();
			num2.add(56);
			num2.add(70);
			System.out.println("the list is : " + num2);
			num2.add(1,30);
			System.out.println("the final list is : " + num2);
			
		}
		 void delete() {
	        	LinkedList<Integer> num3 = new LinkedList<>();
				num3.add(56);
				num3.add(30);
				num3.add(70);
				System.out.println("the list is : " + num3);
				System.out.println("number removed : " + num3.pop());
				System.out.println("the pop list is : " + num3);
				System.out.println();
				num3.add(56);
				num3.add(30);
				num3.add(70);
				System.out.println("the list is : " + num3);
				System.out.println("number removed : " + num3.removeLast());
				System.out.println("the final list is : " + num3);
				
			
			
        }
}

