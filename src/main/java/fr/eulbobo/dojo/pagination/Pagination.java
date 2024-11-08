package fr.eulbobo.dojo.pagination;

public class Pagination {
    public static Pagination withPages(int i) {
        return new Pagination();
    }

    public void displayTo(Displayer displayer) {
        displayer.print("(1) 2 3 4 5");
    }
}
