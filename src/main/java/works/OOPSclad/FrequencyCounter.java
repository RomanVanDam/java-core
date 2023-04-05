package works.OOPSclad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCounter {
    private String fileName;
    private Map<String, Integer> frequencyMap;

    public FrequencyCounter(String fileName) {
        this.fileName = fileName;
        frequencyMap = new TreeMap<>();
        count();
    }

    private void count() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^А-Яа-я]+");
                for (String word : words) {
                    if (word.equals("")) {
                        continue;
                    }
                    String preparedWord = word.toLowerCase();
                    if (frequencyMap.containsKey(preparedWord)) {
                        int currentFrequency = frequencyMap.get(preparedWord);
                        frequencyMap.replace(preparedWord, currentFrequency + 1);
                    } else {
                        frequencyMap.put(preparedWord, 1);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printStat() {
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("Слово %s встречается %d раз\n", entry.getKey(), entry.getValue());
        }
    }
}
