package write.to.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            String myContent = "Việt Nam đất nước ta ơi" + "\nMênh mông biển lúa đâu trời đẹp hơn"
                                + "\nCánh cò bay lả rập rờn" + "\nMây mờ che đỉnh Trường Sơn sớm chiều";
            File file = new File("alexfile.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(myContent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
