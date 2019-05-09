package common.utils;

import java.io.*;

public final class IOUtils {
    public static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        return s;
    }

    public static BufferedReader getFileBufferedReader(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}