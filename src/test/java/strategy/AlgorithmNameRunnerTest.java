package strategy;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class AlgorithmNameRunnerTest {

    private AlgorithmRunner runner = mock(AlgorithmRunner.class);

    @Test
    void callTest() {
        doNothing().when(runner).run();
        runner.run();
        verify(runner, times(1)).run();
    }
}
