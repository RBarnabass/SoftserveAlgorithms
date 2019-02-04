package controller;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class MenuTest {

    private Menu menu = mock(Menu.class);

    @Test
    void callPrintMenuTest() {
        doNothing().when(menu).printMenu();
        menu.printMenu();
        verify(menu, times(1)).printMenu();
    }

    @Test
    void callPrintWelcomeTest() {
        doNothing().when(menu).printWelcome();
        menu.printWelcome();
        verify(menu, times(1)).printWelcome();
    }
}
