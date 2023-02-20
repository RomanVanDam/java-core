package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Books {
    public static void main(String[] args) throws IOException {
        String filePath = "book.csv";
        HashMap<String, String> book = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                book.put(key, value);
            } else {
                System.out.println(line);
            }
        }

        for (String key : book.keySet()) {
            System.out.println(key + ":" + book.get(key));
        }
        reader.close();
    }
}
