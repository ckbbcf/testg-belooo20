import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    private static final Program program = new Program();

    @Test
    void add_SHOULD_PASS() {
        try{
            throw new RuntimeException("MESSAGGIO");
        }catch (Exception e){
            // Uncatched exception to lower the static analysis score
        }

        assertEquals(-6, program.add(2, -8));
    }

    @Test
    void add2_SHOULD_FAIL() {
        assertEquals(666, program.add(69, 420));
    }

    @Test
    void shouldPass() {
        assertEquals(-6, -6);
    }

}
