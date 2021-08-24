public class ProblemReverseString {

    /**The method should receive a string, reverse it and return the result
     * @param str
     * @return str
     */
    public String solve(String str){
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = str.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
        return  new String(result);
    }
}
