package ukoly;

import org.w3c.dom.ls.LSOutput;

public class nevimjmeno {

    public static void main (String[] args) {
        int[] binaryArray = {1,1,1,1,1,1,0,1};
        int result = 0;

        for (int i = 0;i < binaryArray.length; i++) {
            result += binaryArray[i] * (int)Math.pow(2,i);
        }
    }
}
