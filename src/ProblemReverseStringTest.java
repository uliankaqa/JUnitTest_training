import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemReverseStringTest {
    private ProblemReverseString problem;
    @BeforeEach
    public void init(){
       problem = new ProblemReverseString();
    }
    @Test
    public void testSolve_longString_reversString(){
        String res = problem.solve("abcdefgjicklmnopqrst");
        assertEquals("tsrqponmlkcijgfedcba", res);
    }

    @Test
    public void testSolve_emptyString_emptyString(){
        String res = problem.solve("");
        assertEquals("", res);
    }

    @Test
    public void testSolve_oneSymbol_sameString(){
        String res = problem.solve("a");
        assertEquals("a", res);
    }


}