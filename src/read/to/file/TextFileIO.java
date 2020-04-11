package read.to.file;

import java.io.*;

public class TextFileIO {

    public static void readTextFile(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            try {
                fileReader = new FileReader(file);
                int bytes;

                while ((bytes = fileReader.read()) != -1) {
                    System.out.print((char) bytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void readTextFileLine(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

            }catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
