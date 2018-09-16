import java.util.*;

public class Main {

    public static<T extends Comparable<? super T>>
    void intersect(List<T> l1, List<T> l2, List<T> outList) {
        // Return elements common to l1 and l2, in sorted order.
        // outList is an empty list created by the calling
        // program and passed as a parameter.
        // Function should be efficient whether the List is
        // implemented using ArrayList or LinkedList.
        // Do not use HashSet/Map or TreeSet/Map or other complex
        // data structures.

        for(T t: l1){
            if(l2.contains(t)){
                outList.add(t);
            }
        }

    }

    public static<T extends Comparable<? super T>>
    void union(List<T> l1, List<T> l2, List<T> outList) {
        for(T t:l1){
            outList.add(t);
        }
        for(T t: l2){
            if (!outList.contains(t)){
                outList.add(t);
            }

        }
        Collections.sort(outList);
        // Return the union of l1 and l2, in sorted order.
        // Output is a set, so it should have no duplicates.
    }

    public static<T extends Comparable<? super T>>
    void difference(List<T> l1, List<T> l2, List<T> outList) {
        for(T t:l1){
            if(!l2.contains(t)){
                outList.add(t);
            }
        }
        // Return l1 - l2 (i.e, items in l1 that are not in l2), in sorted order.
        // Output is a set, so it should have no duplicates.
    }


    public static void main(String[] args) {
        ArrayList<Integer> list_first=new ArrayList<>();
        ArrayList <Integer> list_second=new ArrayList<>();
        ArrayList <Integer> union_computation= new ArrayList<>();
        ArrayList <Integer> intersec_computation= new ArrayList<>();
        ArrayList <Integer> diff_computation= new ArrayList<>();
        for(int i=10;i<30;i++){
            if(i%3==0){
                list_first.add(i);
            }
            if(i%5==0){
                list_second.add(i);
            }
        }
        union(list_first,list_second,union_computation);
        difference(list_first,list_second,diff_computation);
        intersect(list_first,list_second,intersec_computation);
        System.out.print("List one: ");
        for(int list1: list_first){
            System.out.print(list1+" ");
        }
        System.out.println();
        System.out.print("List two: ");
        for(int list2: list_second){
            System.out.print(list2+" ");
        }
        System.out.println();
        System.out.print("Union: ");
        for(int union_data: union_computation ){
            System.out.print(union_data+" ");
        }
        System.out.println();
        System.out.print("Intersection: ");
        for(int intersec_data: intersec_computation){
            System.out.print(intersec_data+" ");

        }
        System.out.println();
        System.out.print("Difference (List1-List2): ");
        for(int difference_data: diff_computation ){
            System.out.print(difference_data+" ");

        }
    }
}
