package controller;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu = mock(Menu.class);

    @Test public void callPrintMenuTest() {
        doNothing().when(menu).printMenu();
        menu.printMenu();
        verify(menu, times(1)).printMenu();
    }

    @Test public void callPrintWelcomeTest() {
        doNothing().when(menu).printWelcome();
        menu.printWelcome();
        verify(menu, times(1)).printWelcome();
    }
}
