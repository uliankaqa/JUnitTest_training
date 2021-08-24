public class ProblemFindGCD {
    /**
     * The method search GCD( greatest common divisor) for two integers
     * 12 & 18 -> 6
     * 9 & 12 -> 3
     * * @param str
     *  @return str
     *      */
    public int solve(int a, int b){
        int res = 0;

        for (int i = 1; i <= a && i <= b; ++i) {

            // check if i perfectly divides both a and b
            if (a % i == 0 && b % i == 0)
                res = i;
        }
        return res;
    }
}
