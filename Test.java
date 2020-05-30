import java.io.*;

/**
 * Class for tests and introduction to java
 * 
 * @author OssanKASSEGNE
 * @version 0.0.0
 */

public class Test {
    public static void main(final String[] args) {

        System.out.println(args.length);

        String message = "";

        message = args.length > 0 ? "Arguments présents" : "Arguments absents";
        System.out.println(message);
    }
}