package strategy;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AlgorithmRunnerTest {

    private AlgorithmRunner runner = mock(AlgorithmRunner.class);

    @Test public void callTest() {
        doNothing().when(runner).run();
        runner.run();
        verify(runner, times(1)).run();
    }
}
