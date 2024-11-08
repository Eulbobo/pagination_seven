package fr.eulbobo.dojo.pagination;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class FullPageDisplayTest {

    @Test
    void should_display_selected_page_with_no_limit() {
        Displayer displayer = mock(Displayer.class);
        FullPageDisplay display = new FullPageDisplay();

        display.displayWith(displayer, 10, 5);

        verify(displayer).print("1 2 3 4 (5) 6 7 8 9 10");
    }
}