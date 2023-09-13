package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
    static Map<String, String> translateMap = new HashMap<>();

    public String translate(String code){
        StringBuilder result = new StringBuilder();
        String[] splitCodes = code.split(" ");

        for(String splitCode: splitCodes){
            result.append(translateMap.get(splitCode));
        }
        return result.toString();
    }

    public MorseTranslator(){
        translateMap.put(".-", "A");
        translateMap.put("-...", "B");
        translateMap.put("-.-.", "C");
        translateMap.put("-..", "D");
        translateMap.put(".", "E");
        translateMap.put("..-.", "F");
        translateMap.put("--.", "G");
        translateMap.put("....", "H");
        translateMap.put("..", "I");
        translateMap.put(".---", "J");
        translateMap.put("-.-", "K");
        translateMap.put(".-..", "L");
        translateMap.put("--", "M");
        translateMap.put("-.", "N");
        translateMap.put("---", "O");
        translateMap.put(".--.", "P");
        translateMap.put("--.-", "Q");
        translateMap.put(".-.", "R");
        translateMap.put("...", "S");
        translateMap.put("-", "T");
        translateMap.put("..-", "U");
        translateMap.put("...-", "V");
        translateMap.put(".--", "W");
        translateMap.put("-..-", "X");
        translateMap.put("-.--", "Y");
        translateMap.put("--..", "Z");
        translateMap.put("/", " ");

    }

}
