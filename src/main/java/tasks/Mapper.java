package tasks;

import java.util.function.Function;

public class Mapper implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}
