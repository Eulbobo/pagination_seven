package fr.eulbobo.dojo.pagination;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pagination {

    private final int totalPages;
    private int selectedPage = 1;

    private Pagination(int totalPages) {
        this.totalPages = totalPages;
    }

    public static Pagination withPages(int totalPages) {
        return new Pagination(totalPages);
    }

    public void displayTo(Displayer displayer) {
        String toDisplay = IntStream.range(1, totalPages + 1).mapToObj(value -> {
            if (selectedPage == value) {
                return "(" + value + ")";
            }
            return String.valueOf(value);
        }).collect(Collectors.joining(" "));

        displayer.print(toDisplay);
    }

    public void selectPage(int i) {
        selectedPage = i;
    }
}
