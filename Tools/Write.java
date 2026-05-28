import java.io.File;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args) {
        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        if (args.length > 0) {
            int max = Integer.parseInt(args[0]);

            try {
                File folder = new File("Data");

                if (!folder.exists()) {
                    folder.mkdirs();
                }

                FileWriter fileWriter = new FileWriter("Data/" + max + ".txt");

                for (int i = 0; i < max; i++) {
                    int randomNum = (int) (Math.random() * charArray.length);
                    fileWriter.write(charArray[randomNum] + ", ");
                }

                fileWriter.close();

                System.out.println("File written successfully inside 'Data' folder.");
            } catch (Exception e) {
                System.out.println("An error occurred while writing to the file.");
            }
        }
    }
}