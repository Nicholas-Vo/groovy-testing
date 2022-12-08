import java.io.File;
import java.util.Scanner;

public class killFilesJava {

    public static void main(String[] args) {
        // Get the current directory
        File directory = new File(".");

        // Get a list of all files in the directory
        File[] files = directory.listFiles();

        int count = 0;
        for (File f : files) {
            count++;
        }

        // Ask the user for confirmation
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are about to delete " + count + " files. Are you sure? {Y/N}");
        String answer = scanner.nextLine();

        if (!answer.equals("Y")) {
            return;
        }

        // Delete the files if the user confirmed
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }

}