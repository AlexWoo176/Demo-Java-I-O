package write.to.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoAppendFile {
    public static void main(String[] args) {
        String content ="\nBao nhiêu đời đã chịu nhiều thương đau" + "\nMặt người vất vả in sâu" + "\nGái trai cũng một áo nâu nhuộm bùn";
        File file = new File("alexfile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(content);
                System.out.println("Data successfully appended at the end of file");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Exception occurred:");
                    e.printStackTrace();
                }
            }
        }
    }
}
