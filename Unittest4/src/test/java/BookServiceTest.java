import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Test
    public void testGetBookById() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepositoryMock);

        when(bookRepositoryMock.getBookById(1)).thenReturn(new Book(1, "Mocking with Mockito"));

        Book result = bookService.getBookById(1);

        verify(bookRepositoryMock, times(1)).getBookById(1);

        assertEquals("Mocking with Mockito", result.getTitle());
    }
}
