package copy.to.file;

import java.io.*;

public class DemoCopyFile {
    public static void main(String[] args) {
        File infile = new File("/home/alexwoo/IdeaProjects/Việt Nam quê hương ta");
        File outfile = new File("NguyenDinhThi.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(infile);
            fileOutputStream = new FileOutputStream(outfile);

            byte[] bytes = new byte[1024];
            int length;
            while ((length=fileInputStream.read(bytes)) > 0) {
                fileOutputStream.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
                System.out.println("File copied successfully!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
