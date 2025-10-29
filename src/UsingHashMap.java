import java.util.HashMap;

public class UsingHashMap {
    public static void main(String[] args) {
        String sentence = "I'll dance dance dance With my hands hands hands Above my head head head";
        String[] wordInSentence = sentence.toLowerCase().split("\\s+");

        HashMap<String, Integer> listWords = new HashMap<>();

        for(String word : wordInSentence){
            int countWords = listWords.getOrDefault(word, 0);
            listWords.put(word, countWords + 1);
        }

        listWords.forEach((word, countWords) ->
                        System.out.println("word: " + word + ", counted: " + countWords + "x")
                );
    }
}
