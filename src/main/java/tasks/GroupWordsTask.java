package tasks;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class GroupWordsTask {
    public static Integer count(Map.Entry<Character, List<String>> el) {
        int counter = 0;
        char key = el.getKey();
        List<String> arr = el.getValue();
        for(String elem : arr){
            int len = elem.length();
            for(int i = 0; i < len; i++){
                if (key == elem.charAt(i)){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static Map<Character, Integer> groupIt(List<String> array) {
        return array.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::count));
    }
}
