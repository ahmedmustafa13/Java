import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//   --->     Declaring ArrayList
//        if you want to store specifiec type we us <Type>
        ArrayList<Integer> test = new ArrayList<>();

//   --->     Some Methods
//       1--- Adding element into ArrayList add(object) & add(index, object)
        test.add(10);
        test.add(1,20);
        System.out.println(test);   // [10, 20]

//       2--- removing element from ArrayList remove(index)
        test.remove(0);
        System.out.println(test);   // [20]

//       3--- size of ArrayList name.size()
        System.out.println(test.size());  //size is 1

//       4--- Adding another collection into ArrayList addAll(collection)
        ArrayList<Integer> newArrList = new ArrayList<>();
        newArrList.add(70);
        newArrList.add(5);
        newArrList.add(20);

        test.addAll(newArrList);
        System.out.println(test); // [20, 70, 5, 20]

//       5--- get specific value get(index)
        System.out.println(test.get(0));

//       6--- set specific value into index set(index, value)
        test.set(0,5);
        System.out.println(test.get(0));

//       7--- Check if specific value exist contain(object) & containAll(collection)
        System.out.println(test.contains(5));

//       8--- Check ArrayList empty isEmpty()
        System.out.println(test.contains(5));

//       9--- make ArrayList empty clear()
//       10--- sorting arrayList from same type collections.sort(ArrayList)
        Collections.sort(test);
        System.out.println(test);

    }
}