package problams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        HashSet<Integer> hash = new HashSet<Integer>(listA);
        ArrayList<Integer> values = new ArrayList<>();
        for(int i: listB){
            if(hash.contains(i)){
                values.add(i);
            }
        }
        return  values;
    }

    public static void main(String[] args) {
        List<Integer> result = intersection(List.of(1, 6, 8, 9), List.of(9, 3, 6, 8));
        System.out.println(result);
    }
}
