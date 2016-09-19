class SinglyLinkedList<Key> {

	private static class Node<Key> {

		private Key value;
		private Node<Key> next;

		public Node(Key newValue, Node<Key> nextNode) {
			value = newValue;
			next = nextNode;
		} //Node (constructor)

		public Key getValue() {
			return value;
		} //getValue

		public void setValue(Key newValue) {
			value = newValue;
		} //setValue

		public Node<Key> getNext() {
			return next;
		} //getNext

		public void setNext(Node<Key> newNext) {
			next = newNext;
		} //setNext

		public boolean hasNext() {
			if (next == null) {
				return false;
			} else {
				return true;
			} //if-else
		} //hasNext

	} //Node (class)

	// Add function goes here
	private Node<Key> head;
	private Node<Key> tail;
	private int size;

	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	} //SinglyLinkedList (constructor)

	public int size() {
		return size;
	} //size

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		} //if-else
	} //isEmpty

	public void add(Key newInt) {
		Node<Key> newest = new Node(newInt, null);

		if (isEmpty()) {
			head = newest;
		} else {
			tail.setNext(newest);
		} //if

		tail = newest;
		size++;
	} //add

	public void addFirst(Key newInt) {
		Node<Key> newest = new Node(newInt, head);

		if (isEmpty()) {
			tail = newest;
		} //if

		head = newest;
		size++;
	} //addFirst

	public Key get(int index) {
		if (index > size) {
			return null;
		} //if

		Node<Key> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		} //for

		return current.getValue();

	} //get

	public void remove(int location) {
		Node<Key> currentLocation, previousLocation;
		
		if (location == 0) {
			head = head.getNext();
		} else {
			previousLocation = head;
			currentLocation = head.getNext();

			for (int i = 0; i < location-1; i++) {
				previousLocation = previousLocation.getNext();
				currentLocation = currentLocation.getNext();
			} //for

			previousLocation.setNext(currentLocation.getNext());

			if (location == size-1) {
				tail = previousLocation;
			} //if

		} //if-else

		size--;
	} //remove

} //SinglyLinkedList (class)
