public class Structures_Patterns {
    /*
       linear data structures :
       Array
       LinkedList
       Stack-->either made by LL or Array--->pile of books
       Queue-->either made by LL or Array--->queue at store

       Non-linear data structures:(Dynamic data Structure)
       graph
       tree(subset of graph)

       Hash Based:
       HashMap
       Hashset

       **/

    /*

    ARRAY
    fixed data structure
    index position starting form 0
    cache friendly
    random access O(1)
    ease of sorting
    traversal inefficient

    **/
    public static void pattern1(int n){
        for(int row=1;row<n;row++){
            for(int clm=1;clm<=row;clm++){
                System.out.print(clm+" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){

        for(int row=1 ;row<=n;row++){

            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }

            for(int star =1;star<=row*2-1;star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int row=n; row>=1; row--){
            for(int star=1;star<=row*2-1;star++){
                System.out.print("*");
            }
            for(int space=n-row;space>=0;space--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row = 1;row<=n*2-1;row++){

        }
    }


    public static void main(String[] args) {
       // pattern1(5);
        //System.out.println();
        //pattern2(5);
       // System.out.println();
        //pattern3(5);
        //System.out.println();
        pattern4(5);

    }
}
