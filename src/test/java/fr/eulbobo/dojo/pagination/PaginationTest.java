package fr.eulbobo.dojo.pagination;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PaginationTest {

    public static Stream<Arguments> paginationValues() {
        return Stream.of(
                Arguments.of(5, 1, "(1) 2 3 4 5"),
                Arguments.of(5, 2, "1 (2) 3 4 5"),
                Arguments.of(7, 6, "1 2 3 4 5 (6) 7"),
                Arguments.of(100, 42, "1 … 41 (42) 43 … 100"),
                Arguments.of(9, 5, "1 … 4 (5) 6 … 9"),
                Arguments.of(9, 2, "1 (2) 3 4 5 … 9"),
                Arguments.of(9, 4, "1 2 3 (4) 5 … 9")
        );
    }

    @ParameterizedTest
    @MethodSource("paginationValues")
    void should_display_result_given_circumstances(int pages, int selectedPage, String expectedResult) {
        Displayer displayer = mock(Displayer.class);
        Pagination pagination = Pagination.withPages(pages);

        if (selectedPage > 1) {
            pagination.selectPage(selectedPage);
        }

        pagination.displayTo(displayer);
        verify(displayer).print(expectedResult);
    }
}
