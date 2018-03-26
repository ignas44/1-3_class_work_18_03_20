package nuskaitymouzdaviniai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Map;

public class Readercode {
    private static final String CODE_FILE_NAME = "files/koduote.txt";

    public void readFileAndPutToMaps (Map<Integer, String>codeMap, Map<String,Integer> valuesMap) throws  JAcodeexeption {
        try (BufferedReader bf= new BufferedReader(new FileReader(CODE_FILE_NAME))){ // nusiskaitymas is failo
            String line;
            while ((line=bf.readLine())!=null) {
                String[] items = line.split(" ");
                if (items.length != 2) {
                    throw new JAcodeexeption("Koduote yra bloga");


                }
                codeMap.put(Integer.valueOf(items[0]), items[1]);
                valuesMap.put(items[1], Integer.valueOf(items[0]));
            }
        }

         catch (IOException e) {
            e.printStackTrace();
        }
    }
}






