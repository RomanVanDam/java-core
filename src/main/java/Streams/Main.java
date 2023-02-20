package Streams;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(".");
        for (String fileNames : file.list()) System.out.println(fileNames);
    }
}
