import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUpperToLowerLowerToUpperCaseTest {
    private ProblemUpperToLowerLowerToUpperCase problem;
    @BeforeEach
    public void init(){
        problem = new ProblemUpperToLowerLowerToUpperCase();
    }

    @Test
    public void testSolve_upper_lower(){
        String res = problem.solve("Hello World !");
        assertEquals("hELLO wORLD !", res);
    }

    @Test
    public void testSolve_onlyUpper(){
        String res = problem.solve("HELLO WORLD !");
        assertEquals("hello world !", res);
    }

    @Test
    public void testSolve_onlyLower(){
        String res = problem.solve("hello world !");
        assertEquals("HELLO WORLD !", res);
    }

    @Test
    public void testSolve_onlyInteger(){
        String res = problem.solve("267636874");
        assertEquals("267636874", res);
    }

    @Test
    public void testSolve_emptyString(){
        String res = problem.solve("");
        assertEquals("", res);
    }

    @Test
    public void testSolve_onlySymbols(){
        String res = problem.solve("!§$%&//((");
        assertEquals("!§$%&//((", res);
    }

    @Test
    public void testSolve_longString(){
        String res = problem.solve("!§dG6nmnmnEF/HQKcKKjdj$%&//((");
        assertEquals("!§Dg6NMNMNef/hqkCkkJDJ$%&//((", res);
    }

}