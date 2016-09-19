class BST {

    private class BTreeNode {
        private int value;
        private BTreeNode parent;
        private BTreeNode leftChild;
        private BTreeNode rightChild;

        public BTreeNode(int v, BTreeNode p, BTreeNode l, BTreeNode r) {
            value = v;
            parent = p;
            leftChild = l;
            rightChild = r;
        } //BTreeNode (constructor)

        public int getValue() {
            return value;
        } //getValue

        public void setValue(int v) {
            value = v;
        } //set Value

        public BTreeNode getParent() {
            return parent;
        } //getParent

        public void setParent(BTreeNode p) {
            parent = p;
        } //setParent

        public BTreeNode getLeftChild() {
            return leftChild;
        } //getLeftChild

        public void setLeftChild(BTreeNode l) {
            leftChild = l;
        } //setLeftChild

        public BTreeNode getRightChild() {
            return rightChild;
        } //getRightChild

        public void setRightChild(BTreeNode r) {
            rightChild = r;
        } //setRightChild

    } //BTreeNode (internal class)


    // start of BST class
    BTreeNode root;
    int size;

    public BST() {
        root = null;
        size = 0 ;
    } //BST (constructor)

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


    /*
     ** This is the setup function for insert
     ** It takes a value as input, and calls the recursive insert function starting at the root
     */
    public void insert(int value) {
        insert(value, root);
    } //add (setup)

    /*
     ** This is the recursive function for insert
     ** It takes a value and a BTreeNode as input, and either adds a node at the current location
     ** (if null), or travels to the left or right child to try to insert there
     */
    public void insert(int value, BTreeNode currentLocation) {
        if (root == null) {
            root = new BTreeNode(value, null, null, null);
        } //if
        else if (currentLocation.getValue() < value) {
            BTreeNode temp = currentLocation.getRightChild();

            if (temp == null) {
                currentLocation.setRightChild(new BTreeNode(value, currentLocation, null, null));
            } //if
            else {
                insert(value, temp);
            } //else if
        }

          else if (currentLocation.getValue() > value) {
               BTreeNode temp = currentLocation.getLeftChild();

                if (temp == null) {
                    currentLocation.setLeftChild(new BTreeNode(value, currentLocation, null, null));
                }
                else {
                    insert(value, temp);
                }
            }
     } //add (recursive)



    /*
     ** This is the setup function for get
     ** It takes a value as input, and calls the recursive get function starting at the root
     **
     ** If the value isn't found, let's return a -1
     */
    public int get(int value) {
        return get(value, root);
      } //get (setup)

    /*
     ** This is the recursive function for get
     ** It takes a value and a BTreeNode as input, and either finds a node at the current location
     ** (if value=currentLocation.getValue()), or travels to the left or right child to try to find it there
     **
     ** If the value isn't found, let's return a -1
     */
    public int get(int value, BTreeNode currentLocation) {
        if (currentLocation.getValue() == value) {
            return value;
        }
        if (currentLocation.getValue() < value) {
            BTreeNode temp = currentLocation.getRightChild();
            if (temp == null) {
                return -1;
            } //if
            else {
                return get(value, temp);
            } //else
        } //if

        if (currentLocation.getValue() > value) {
            BTreeNode temp = currentLocation.getLeftChild();
            if (temp == null) {
                return -1;
            } //internal if
            else {
                return get(value, temp);
            }
        }

            return value;
     } //get (recursive)



    /*
     ** This is the setup function for remove
     ** It takes a value as input, and calls the recursive remove function starting at the root
     */
    public void remove(int value) {
        remove(value, root);
      } //remove (setup)

    /*
     ** This is the recursive function for remove
     ** It takes a value and a BTreeNode as input, and either removes the node at the current location
     ** (if value=currentLocation.getValue()), or travels to the left or right child to try to remove from there
     */
    public void remove(int value, BTreeNode currentLocation) {
        //removing a node with no children

        if (currentLocation.getValue() == value && currentLocation.getLeftChild() == null && currentLocation.getRightChild() == null) {
            currentLocation.setValue(-1);
        } //if

        //removing a node with children

       else if (currentLocation.getValue() == value && currentLocation.getRightChild() != null) {
            BTreeNode temp1 = currentLocation.getParent();
            BTreeNode temp2 = currentLocation.getRightChild();

            if (temp1.getRightChild() != null && temp1.getRightChild().getValue() == value) {
                temp1.setRightChild(temp2);
            }
            else {
                temp1.setLeftChild(temp2);
            }

            temp2.setParent(temp1);
        }

        else if (currentLocation.getValue() == value && currentLocation.getLeftChild() != null) {
           BTreeNode temp1 = currentLocation.getParent();
           BTreeNode temp2 = currentLocation.getLeftChild();

            if (temp1.getLeftChild() != null && temp1.getLeftChild().getValue() == value) {
                temp1.setLeftChild(temp2);
            }
            else {
                temp1.setRightChild(temp2);
            }

            temp2.setParent(temp1);
        }

            else if (currentLocation.getValue() < value) {
                remove(value, currentLocation.getRightChild());
            }
            else if (currentLocation.getValue() > value) {
                remove(value, currentLocation.getLeftChild());
            }

    } //remove (recursive)

} //BST
