package PracticeSet.atlaslearnings.day37.day37Test.Test;

import day37Test.Main.BookRepository;
import day37Test.Main.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class Test03 {
    @Mock
    BookRepository bookRepository;
    @Spy
    @InjectMocks
    BookService bookServiceSpy;
    @Test
    void shouldReturnInStockWhenCountIsNormal() {

        when(bookRepository.getBookCount()).thenReturn(20);
        String status = bookServiceSpy.getBookServiceStatus();
        verify(bookServiceSpy, times(1)).isBookCountLow();
        assertEquals("IN_STOCK", status);
    }
    @Test
    void shouldReturnLowStockWhenIsBookCountLowIsStubbed() {
        doReturn(true).when(bookServiceSpy).isBookCountLow();

        String status = bookServiceSpy.getBookServiceStatus();

        verify(bookServiceSpy, times(1)).isBookCountLow();

        assertEquals("LOW_STOCK", status);

        verify(bookRepository, never()).getBookCount();
    }
}
