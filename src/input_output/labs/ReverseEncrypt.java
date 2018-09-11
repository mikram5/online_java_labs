package input_output.labs;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReverseEncrypt {
    public static void main(String[] args) {

        int i;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/michaelramey/desktop/IO/writer.txt"))) {
            do {
                i = br.read();

                if ((char) i == '-')
                    i = 'a';
                if ((char) i == '~')
                    i = 'e';
                if (i != -1)
                    System.out.print((char)i);

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}