package problams;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FiveSort {

    public static List<Integer> fiveSort(List<Integer> array) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        for(int i : array){
//            if(i == 5){
//                list.add(5);
//            }else{
//                list2.add(i);
//            }
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//        result.addAll(list2);
//        result.addAll(list);
        int i = 0;
        int j = array.size() -1;
        while (i < j){
            if (array.get(j) == 5){
                j -= 1;
            }else if(array.get(i) != 5){
                i += 1;
            }else{
                Collections.swap(array, i, j);
            }
        }
        return array;
    }
    public static void main(String[] args){
        List<Integer> d = fiveSort(List.of(5, 7, 3, 2, 1, 5, 5, 2));
        System.out.println(d);
    }
}
