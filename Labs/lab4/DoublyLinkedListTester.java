class DoublyLinkedListTester {

	public static void main(String args[]) {
		DoublyLinkedList myList = new DoublyLinkedList();
		addItems(myList, 4);
		printCurrentState(myList);
		myList.remove(2);
		printCurrentState(myList);
		System.out.println(myList.getFromEnd(2) + "\n");
		System.out.println(myList.testPreviousLinks());
		removeAll(myList);
		myList.add(17);
		printCurrentState(myList);
	} //main

	public static void addItems(DoublyLinkedList currentList, int number) {
		for (int i = 0; i < number; i++) {
			currentList.add(i+1);
		} //for
	} //if

	public static void printCurrentState(DoublyLinkedList currentList) {
		System.out.println("Printing list contents:");
		for (int i = 0; i < currentList.size(); i++) {
			System.out.println(currentList.get(i));
		} //for
		System.out.println();
	} //printCurrentState

	public static void removeAll(DoublyLinkedList currentList) {
		int s = currentList.size();
		System.out.println("\nEmptying list");
		for (int i = 0; i < s; i++) {
			currentList.remove(0);
		} //if
		System.out.println(currentList.isEmpty());
		System.out.println();
	} //removeAll

} //SinglyLinkedList (class)
