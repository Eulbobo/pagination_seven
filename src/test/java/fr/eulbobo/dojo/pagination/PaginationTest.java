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
}
