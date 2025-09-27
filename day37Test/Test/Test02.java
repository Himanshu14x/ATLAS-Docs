package PracticeSet.atlaslearnings.day37Test.Test;

import day37Test.Main.ToyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class Test02 {

    @Spy
    ToyService spyToyService;

    @Test
    void method1() {

        String name = spyToyService.getToyName(1);

        assertEquals("Lego", name);

        verify(spyToyService, times(1)).getToyName(1);
    }

    @Test
    void method2() {
        doReturn("Default toy").when(spyToyService).getFallbackName();

        String name = spyToyService.getToyName(3);


        assertEquals("Default toy", name);


        verify(spyToyService, times(1)).getFallbackName();
    }
}
