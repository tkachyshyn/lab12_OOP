package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static tasks.GroupWordsTask.groupIt;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "2", "3");
        System.out.println(FlattingTask.flattingStrings(arr));
        System.out.println(Arrays.asList("hello".split("")));
        System.out.println(MapTask.mapping(arr));
        List<String> array = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(groupIt(array));
        List<Integer> arr2 = IntStream.range(0, 10).mapToObj(x -> x * x).collect(Collectors.toList());
    }
}
