package fr.eulbobo.dojo.pagination;

public class PartialPageDisplay implements PageDisplay {

    private static final String PARTIAL_DISPLAY_SEPARATOR = " … ";

    @Override
    public void displayWith(Displayer displayer, int totalPages, int selectedPage) {
        if (selectedPage < 5) {
            displayer.print(ValueDisplay.displayValues(1, 5, selectedPage) + PARTIAL_DISPLAY_SEPARATOR + totalPages);
        } else if (selectedPage > totalPages - 4) {
            displayer.print("1" + PARTIAL_DISPLAY_SEPARATOR + ValueDisplay.displayValues(totalPages - 4, totalPages, selectedPage));
        } else {
            displayer.print("1" + PARTIAL_DISPLAY_SEPARATOR + ValueDisplay.displayValues(selectedPage - 1, selectedPage + 1, selectedPage) + PARTIAL_DISPLAY_SEPARATOR + totalPages);
        }
    }
}
