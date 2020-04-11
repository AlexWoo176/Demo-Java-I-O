package read.to.file;

public class Test {
    public static void main(String[] args) {
        TextFileIO textFileIO = new TextFileIO();
        textFileIO.readTextFile("alexfile.txt");
        textFileIO.readTextFileLine("alexfile.txt");
        textFileIO.readTextFileLine("/home/alexwoo/IdeaProjects/Việt Nam quê hương ta");

    }
}
