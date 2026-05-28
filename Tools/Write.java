import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        if (args.length > 0) {
            int limit = Integer.parseInt(args[0]);

            try {
                File folder = new File("Data");

                if (!folder.exists()) {
                    folder.mkdirs();
                }

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Data/" + limit + ".txt"));

                for (int i = 0; i < limit; i++) {
                    int randomNum = (int) (Math.random() * charArray.length);
                    bufferedWriter.write(charArray[randomNum] + ", ");
                }

                bufferedWriter.close();

                System.out.println("File written successfully inside 'Data' folder.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
    }
}