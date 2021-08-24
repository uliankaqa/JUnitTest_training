import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemFindGCDTest {
    private ProblemFindGCD problem;
    @BeforeEach
    public void init(){
        problem = new ProblemFindGCD();
    }

    @Test
    public void testsSolve_twoInteger_gcd(){
        int a = 27;
        int b = 15;
        int res = problem.solve(a,b);
        assertEquals(res, 3);
    }

    @Test
    public void testsSolve_oneIntegerZero_zero(){
        int a = 0;
        int b = 15;
        int res = problem.solve(a,b);
        assertEquals(res, 0);
    }

    @Test
    public void testsSolve_twoIntegerZero_zero(){
        int a = 0;
        int b = 0;
        int res = problem.solve(a,b);
        assertEquals(res, 0);
    }

    @Test
    public void testsSolve_oneIntegerNegative_zero(){
        int a = -5;
        int b = 0;
        int res = problem.solve(a,b);
        assertEquals(res, 0);
    }

    @Test
    public void testsSolve_oneIntegerLarge_gds(){
        int a = 25;
        int b = 1239833895;
        int res = problem.solve(a,b);
        assertEquals(res, 5);
    }
}