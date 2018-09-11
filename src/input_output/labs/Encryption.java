package input_output.labs;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption {
    public static void main(String[] args) {

        int i;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/michaelramey/desktop/IO/reader.txt"));
             FileWriter fw = new FileWriter("/Users/michaelramey/desktop/IO/writer.txt")) {

            do {
                i = br.read();

                if ((char) i == 'a')
                    i = '-';
                if ((char) i == 'e')
                    i = '~';
                if (i != -1)
                    fw.write(i);

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
          }
    }
}



