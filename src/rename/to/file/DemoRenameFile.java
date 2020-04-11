package rename.to.file;

import java.io.File;
import java.io.IOException;

public class DemoRenameFile {
    public static void main(String[] args) {
        File oldFile = new File("alexfile.txt");

        File newFile = new File("VietNam.txt");

        if (!oldFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        boolean flag = oldFile.renameTo(newFile);

        if (flag) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Rename operation failed");
        }

    }
}