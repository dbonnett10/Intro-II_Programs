class SinglyLinkedList {

    private static class Node {

        private int value;
        private Node next;

        public Node(int newValue, Node nextNode) {
            value = newValue;
            next = nextNode;
        } //Node (constructor)

        public int getValue() {
            return value;
        } //getValue

        public void setValue(int newValue) {
            value = newValue;
        } //setValue

        public Node getNext() {
            return next;
        } //getNext

        public void setNext(Node newNext) {
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

    //Singly linked list class
    private Node head;
    private Node tail;
    private int size;
    private Node current;

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

    public void add(int newInt) {
        Node newest = new Node(newInt, null);

        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }

        tail = newest;
        size++;
    } //add

    public void addFirst(int newInt) {
        Node newest = new Node(newInt, head);

        if (isEmpty()) {
            tail = newest;
        }

        head = newest;
        size++;
        current = head;
    } //addFirst

    public void addSorted(int newInt) {
        Node newest = new Node(newInt, null);
        current = head;

        if (isEmpty()) {
            head = newest;
            tail = head;
            size++;
        }

        else if (newest.getValue() < head.getValue()) {
            addFirst(newInt);
        }

        else {

            try {

                 while (current.getNext().getValue() < newInt) {
                    current = current.getNext();
                }
                newest.setNext(current.getNext());
                current.setNext(newest);
                size++;

            }
            catch(NullPointerException npe) {
                add(newInt);
            }
        }

    } //addSorted

    public int getRecursive(int index) {
        return getRecursive(index, 0, head);
    } //first getRecursive call

    public int getRecursive(int index, int currLocation, Node currentNode) {
        if (currLocation == index) {
            return currentNode.getValue();
        }
        else {
            return getRecursive(index, currLocation + 1, currentNode.getNext());
        }
    } //second getRecursive call

    public int get(int index) {
        if (index > size) {
            return -1;
        }

        Node current = head;
        for (int i= 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public void remove(int location) {
        Node currentLocation, previousLocation;

        if (location == 0) {
            head = head.getNext();
        } else {
            previousLocation = head;
            currentLocation = head.getNext();

            for (int i = 0; i < location-1; i++) {
                previousLocation = previousLocation.getNext();
                currentLocation = currentLocation.getNext();
            }

            previousLocation.setNext(currentLocation.getNext());

            if (location == size-1) {
                tail = previousLocation;
            }

        }

        size--;
    } //remove

} //SinglyLinkedList (class)
