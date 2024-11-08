package fr.eulbobo.dojo.pagination;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValueDisplay {

    public static String displayValues(int from, int to, int selectedValue) {
        return IntStream.range(from, to + 1).mapToObj(value -> {
            if (selectedValue == value) {
                return "(" + value + ")";
            }
            return String.valueOf(value);
        }).collect(Collectors.joining(" "));
    }
}
