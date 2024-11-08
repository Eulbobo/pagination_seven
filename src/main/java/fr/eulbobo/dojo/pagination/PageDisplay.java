package fr.eulbobo.dojo.pagination;

public interface PageDisplay {

    void displayWith(Displayer displayer, int totalPages, int selectedPage);
}
