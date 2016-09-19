class DoublyLinkedList {

    private static class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int newValue, Node nextNode, Node lastNode) {
            value = newValue;
            next = nextNode;
            previous = lastNode;
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

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node lastNode) {
            previous = lastNode;
        }

        public boolean hasNext() {
            if (next == null) {
                return false;
            } else {
                return true;
            } //if-else
        } //hasNext

    } //Node (class)

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    } //DoublyLinkedList (constructor)

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
        Node newest = new Node(newInt, null, tail);

        if (isEmpty()) {
            head = newest;

        }
        else {
            tail.setNext(newest);
        }

        tail = newest;
        size++;

    } //add

    public int get(int index) {
        if (index > size) {
            return -1000000000;
        } //if

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        } //for

        return current.getValue();

    } //get

    public int getFromEnd(int index) {
        if (index > size) {
            return -1000000000;
        }

        Node current = tail;
        for (int i = 0; i < index; i++) {
            current = current.getPrevious();
        }

        return current.getValue();

    } //getFromEnd

    public void remove(int location) {
        Node currentLocation, previousLocation;

        if (location == 0) {
            head = head.getNext();
        }
        else {
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
            if(currentLocation.getNext() == null){
                currentLocation.getNext().setPrevious(null);
            }
            else {
                currentLocation.getNext().setPrevious(previousLocation);
            }
        }

        size--;


    } //remove

    public boolean testPreviousLinks() {
        Node current = tail;
        int count = 1;
        while (current.getPrevious() != null) {
            current = current.getPrevious();
            count++;
        } //while
        return ((current == head) && (count == size));
    } //testPreviousLinks

} //DoublyLinkedList (class)
