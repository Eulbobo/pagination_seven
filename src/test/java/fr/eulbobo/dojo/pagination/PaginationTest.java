package fr.eulbobo.dojo.pagination;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PaginationTest {

    @Test
    void should_highlight_1_when_created_with_5_pages() {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(5);

        pagination.displayTo(displayer);
        verify(displayer).print("(1) 2 3 4 5");
    }

    @Test
    void should_highlight_2_when_created_with_5_pages_and_page_2_is_selected() {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(5);

        pagination.selectPage(2);

        pagination.displayTo(displayer);
        verify(displayer).print("1 (2) 3 4 5");
    }

    @Test
    void should_highlight_6_when_created_with_7_pages_and_page_6_is_selected() {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(7);

        pagination.selectPage(6);

        pagination.displayTo(displayer);
        verify(displayer).print("1 2 3 4 5 (6) 7");
    }

    @Test
    void should_highlight_page_in_middle_of_list_if_list_has_a_lot_of_pages() {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(100);

        pagination.selectPage(42);

        pagination.displayTo(displayer);
        verify(displayer).print("1 … 41 (42) 43 … 100");
    }

    @Test
    void should_highlight_page_in_middle_of_list_with_9_pages() {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(9);

        pagination.selectPage(5);

        pagination.displayTo(displayer);
        verify(displayer).print("1 … 4 (5) 6 … 9");
    }
}
