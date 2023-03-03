package fileWorkers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFiles {


    private static final int asciin = '\n';
    private static final int asciir = '\r';

    private String readLine(InputStreamReader fileReader) throws IOException {
        boolean newLine = false;
        int cur, prev = -2;
        StringBuilder line = new StringBuilder();
        while ((cur = fileReader.read()) != -1) {
            if ((cur == asciin || cur == asciir) && prev != -2) {
                newLine = true;
            } else {
                if (cur != asciin) {
                    line.append((char) cur);
                }
            }
            if (newLine) {
                return line.toString();
            }
            prev = cur;
        }
        if (line.length() > 0) {
            return line.toString();
        }
        return null;

    }

    public String getLine(InputStreamReader reader) {
        String line = null;

        try {
            InputStreamReader fileReader = reader;
            line = readLine(fileReader);
            return line;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Unable to read");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Unreachable block. Just in case.");
        }
        return line;
    }
}


