package input_output.labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/Users/michaelramey/desktop/practice_file1.txt");
            out = new FileOutputStream("/Users/michaelramey/desktop/practice_file2.txt");

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException io) {
            System.out.println("IO Exception occurred : " + io.getMessage());
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch (IOException io) {
                System.out.println("Unable to close the connections.");
            }
        }

    }
}
