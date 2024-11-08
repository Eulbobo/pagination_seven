package fr.eulbobo.dojo.pagination;

public class Pagination {

    private final int totalPages;
    private final int maxPagesToDisplay;
    private final PageDisplay fullPageDisplay = new FullPageDisplay();
    private final PageDisplay partialPageDisplay = new PartialPageDisplay();
    private int selectedPage = 1;


    private Pagination(int totalPages, int maxPagesToDisplay) {
        this.totalPages = totalPages;
        this.maxPagesToDisplay = maxPagesToDisplay;
    }

    public static Pagination withPages(int totalPages) {
        return new Pagination(totalPages, 7);
    }

    public void displayTo(Displayer displayer) {
        if (totalPages <= maxPagesToDisplay) {
            fullPageDisplay.displayWith(displayer, totalPages, selectedPage);
        } else {
            partialPageDisplay.displayWith(displayer, totalPages, selectedPage);
        }
    }

    public void selectPage(int i) {
        selectedPage = i;
    }
}
