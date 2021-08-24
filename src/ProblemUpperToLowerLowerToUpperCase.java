import java.util.Locale;

public class ProblemUpperToLowerLowerToUpperCase {
    /**
     * The method
     * @param str
     * @return
     */
    public String solve(String str ){
        char[] strAsCharArray = str.toCharArray();

        String result = "";

        for (int i = 0; i < strAsCharArray.length; i++) {
            char ch = (char) strAsCharArray[i];
            if((int)ch > 64 && (int)ch < 91){
                result += String.valueOf(ch).toLowerCase();
            }else if((int)ch > 96 && (int)ch < 123){
                result += String.valueOf(ch).toUpperCase();
            }else {
                result += String.valueOf(ch);
            }


        }
        System.out.println(result);
        return  result;
    }
}
