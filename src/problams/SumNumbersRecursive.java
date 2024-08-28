package problams;

import java.util.ArrayList;
import java.util.List;

public class SumNumbersRecursive {
    public static int sumNumbersRecursive(List<Integer> numbers) {

        return sumNumber(numbers);
    }

    public static int sumNumber(List<Integer> numbers){
        if(numbers.isEmpty()){
            return 0;
        }


        return numbers.get(0) + sumNumber(numbers.subList(1, numbers.size()));
    }
    public static void main(String[] args){
        int value = sumNumbersRecursive(List.of(1, -1, 1, -1, 1, -1, 1));
        System.out.println(value);
    }
}
