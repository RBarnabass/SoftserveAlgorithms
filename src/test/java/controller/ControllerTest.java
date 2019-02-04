package controller;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ControllerTest {

    private Controller controller = mock(Controller.class);

    @Test
    void callTest() {
        doNothing().when(controller).start();
        controller.start();
        verify(controller, times(1)).start();
    }

    @Test
    void timeoutTest() {
        doNothing().when(controller).start();
        controller.start();
        verify(controller, timeout(2000)).start();
    }
}
