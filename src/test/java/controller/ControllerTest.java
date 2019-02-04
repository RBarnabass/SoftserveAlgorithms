package controller;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ControllerTest {

    private Controller controller = mock(Controller.class);

    @Test public void callTest() {
        doNothing().when(controller).start();
        controller.start();
        verify(controller, times(1)).start();
    }
}
