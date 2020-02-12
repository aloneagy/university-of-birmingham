package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListDictionary implements Dictionary {
    private static ArrayList<WordSig> words;

    /**
     * @param dictionaryPath
     * @return
     * @description: constructor for the class ListDictionary that takes a String path to the
     * dictionary, if the word satisfy these condition, this method will read stores it in an ArrayList.
     */
    public ListDictionary(String dictionaryPath) {
        words = new ArrayList<WordSig>();
        String line;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(dictionaryPath));
        } catch (FileNotFoundException e) {
            System.out.println("file is not found");
        }
        while (scanner.hasNext()) {
            line = scanner.nextLine().toLowerCase();
            if (PredictivePrototype.isValidWord(line)) {
                String signature = PredictivePrototype.wordToSignature(line);
                WordSig wordSigPair = new WordSig(signature, line);
                words.add(wordSigPair);
            }
        }
        Collections.sort(words);
        if (null != scanner) {
            scanner.close();
        }
    }


    /**
     * @param signature
     * @return java.util.Set<String> the words meet these condition
     * @description: looking for some words by binary search, if the word is found,this method will search other
     * words which satisfy these conditions,until all of these words are found.
     *
     */
    @Override
    public Set signatureToWords(String signature) {
        HashSet result = new HashSet<>();
        if (signature.length() == 0) {
            return result;
        }
        int index = Collections.binarySearch(words, new WordSig(signature, null));
        if (index >= 0 && words.get(index).getSignature().equals(signature)) {
            result.add(words.get(index).getWords());
            for (int i = index - 1; i >= 0; i--) {
                if( words.get(i).getSignature().equals(signature)){
                    result.add(words.get(i).getWords());
                }
            }

            for (int i = index + 1; i < words.size(); i++) {
                if (words.get(i).getSignature().equals(signature)) {
                    result.add(words.get(i).getWords());
                }
            }
        }
        return result;
    }
}