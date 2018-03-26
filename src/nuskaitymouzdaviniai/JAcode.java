package nuskaitymouzdaviniai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JAcode {

    public static void main(String[] args) {

        Map<Integer, String> codeMap= new HashMap<>();
        Map <String, Integer> valuesMap= new HashMap<>();

      Readercode readercode= new Readercode();
      try {
          readercode.readFileAndPutToMaps(codeMap, valuesMap);
          Scanner scanner= new Scanner(System.in);
          System.out.println("Iveskite teksta kodavimui");
          String line = scanner.nextLine();
          for (int i = 0 ; i< line.length();i++){
              String temp= String.valueOf(line.charAt(i));
              String letter = temp.equals(" ") ? "tarpas" : temp;
              System.out.println(valuesMap.get(letter));
          }
      }catch (JAcodeexeption e){
          System.out.println("Koduote pazeista");
      }
    }
}
