import java.util.*;

class ListTester {

	public static void main(String args[]) {

		SinglyLinkedList myList = new SinglyLinkedList();

		myList.add(-4);
		myList.add(5);
		myList.add(7);
		myList.add(17);
        myList.add(47);

        System.out.println();
        System.out.println("Original list items:");
        System.out.println();

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.getRecursive(i));
		} //for

        System.out.println("----- adding a middle number");

        myList.addSorted(23);

        	for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.getRecursive(i));
		} //for

        System.out.println("----- adding a small number");

        myList.addSorted(-11);

        	for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.getRecursive(i));
		} //for

        System.out.println("----- adding a large number:");

        myList.addSorted(60);

         	for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.getRecursive(i));
		} //for

        System.out.println("---------- empty list");

        SinglyLinkedList myNewList = new SinglyLinkedList();
        myNewList.addSorted(12);

        for (int i = 0; i < myNewList.size(); i++) {
            System.out.println(myNewList.getRecursive(i));
        }











	} //main

} //ListTester (class)
