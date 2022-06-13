package linkedList;

import java.util.LinkedList;

public class List{
	
	
	public static void main(String[] args) {
		List obj = new List();
		obj.create();
		obj.add();
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
}
