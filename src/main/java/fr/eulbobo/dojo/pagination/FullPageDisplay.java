package fr.eulbobo.dojo.pagination;

import static fr.eulbobo.dojo.pagination.ValueDisplay.displayValues;

public class FullPageDisplay implements PageDisplay {

    public void displayWith(Displayer displayer, int totalPages, int selectedPage) {
        displayer.print(displayValues(1, totalPages, selectedPage));
    }
}
