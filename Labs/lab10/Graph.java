import java.util.*;

class Graph {

    int num;
    static boolean[][] values;
    boolean[] marked;

    public Graph(int n) {
        num = n;
        marked = new boolean[n];
        values = new boolean[n][n];
    }

    public static void addEdge(int i, int j) {
        values[i][j] = true;
        values[j][i] = true;
    }
    public static void removeEdge(int i, int j) {
        values[i][j] = false;
        values[j][i] = false;
    }
    public static boolean hasEdge(int i, int j) {
        return values[i][j];
    }

    public static boolean hasPath(int head, int tail) {
        boolean[] marked = new boolean[values.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(head);
        while(!q.isEmpty()){
            int v = q.remove();
            if (v == tail) {
                return true;
            }
            if(!marked[v]){
                marked[v] = true;

            } //if
            for (int i = 0; i < values.length; i++) {
                if (hasEdge(i, v) && marked[i] == false) {
                    q.add(i);
                } //if
            } //for
        } //while
        return false;
    } //hasPath

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many vertices?");
        int vertices = scan.nextInt();
        values = new boolean[vertices][vertices];

        int endpoint;
        int endpoint2;

        System.out.println("");

        while (true) {
            while (true) {
                System.out.println("Enter the first endpoint:");
                endpoint = scan.nextInt();
                System.out.println("");
                if (endpoint > vertices-1) {
                    System.out.println("Try again" + "\n");
                }
                else if (endpoint < -1) {
                    System.out.println("Try again + \n");
                }
                else {
                    break;
                }
            } //while
            if (endpoint == -1) {
                break;
            } //if
            while (true) {
                System.out.println("Enter the second endpoint:");
                endpoint2 = scan.nextInt();
                System.out.println("");
                if (endpoint2 > vertices-1) {
                    System.out.println("Try again" + "\n");
                }
                else if (endpoint2 < -1) {
                    System.out.println("try again" + "\n");
                }
                else {
                    break;
                }
            } // while


            if (hasEdge(endpoint, endpoint2)) {
                System.out.println("The edge already exists" + "\n");
            }
            else {
                addEdge(endpoint, endpoint2);
                System.out.println("The edge was added" + "\n");
            }



        } //first while loop

         while (true) {
            while (true) {
                System.out.println("Enter the first endpoint of the path: ");
                endpoint = scan.nextInt();
                System.out.println("");
                if (endpoint > vertices-1) {
                    System.out.println("Try again" + "\n");
                }
                else if (endpoint < -1) {
                    System.out.println("Try again" + "\n");
                }
                else {
                    break;
                }
            } //while
            if (endpoint == -1) {
                break;
            } //if
            while (true) {
                System.out.println("Enter the second endpoint of the path: ");
                endpoint2 = scan.nextInt();
                System.out.println("");
                if (endpoint2 > vertices-1) {
                    System.out.println("Try again" + "\n");
                }
                else if (endpoint2 < -1) {
                    System.out.println("try again" + "\n");
                }
                else {
                    break;
                }
            } // while

            if (hasPath(endpoint, endpoint2)) {
                System.out.println("The path exists" + "\n");
            }
            else {
                System.out.println("The path does not exist" + "\n");
            }


    }
}
}


