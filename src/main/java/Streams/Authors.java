package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Authors {
    public static void main(String[] args) throws IOException {
        String filePath = "author.csv";
        HashMap<String, String> author = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                author.put(key, value);
            } else {
                System.out.println(line);
            }
        }

        for (String key : author.keySet()) {
            System.out.println(key + ":" + author.get(key));
        }
        reader.close();
    }
}
