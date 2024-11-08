package fr.eulbobo.dojo.pagination;

public class PartialPageDisplay implements PageDisplay {

    private static final String PARTIAL_DISPLAY_SEPARATOR = " … ";

    @Override
    public void displayWith(Displayer displayer, int totalPages, int selectedPage) {
        String middle = ValueDisplay.displayValues(selectedPage - 1, selectedPage + 1, selectedPage);

        displayer.print("1" + PARTIAL_DISPLAY_SEPARATOR + middle + PARTIAL_DISPLAY_SEPARATOR + totalPages);
    }
}
